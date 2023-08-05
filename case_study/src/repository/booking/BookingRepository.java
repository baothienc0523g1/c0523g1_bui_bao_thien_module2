package repository.booking;

import model.business.Booking;
import model.business.Contract;
import utilities.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookingRepository extends ReadAndWrite implements IBookingRepository {
    private String BOOKING_LOCAL_FILE = "D:\\GIT - Bai tap\\case_study\\src\\data\\booking.csv";
    private String CONTRACT_LOCAL_FILE = "D:\\GIT - Bai tap\\case_study\\src\\data\\contract.csv";

    @Override
    public void add(Booking booking) {
        getBookingListFromCSV().add(booking);

        List<String> temp = new ArrayList<>();
        temp.add(booking.toStringForSave());
        myWriteToCSV(temp, BOOKING_LOCAL_FILE, true);
    }

    @Override
    public List<Booking> getList() {
        Collections.sort(getBookingListFromCSV());
        return getBookingListFromCSV();
    }

    @Override
    public void createNewContracts(Contract contract) {
        List<String> temp = new ArrayList<>();
        getContractListFromCSV().add(contract);
        temp.add(contract.toStringForSave());
        myWriteToCSV(temp, CONTRACT_LOCAL_FILE, true);
    }

    @Override
    public List<Contract> getContractList() {
        return getContractListFromCSV();
    }

    private List<Booking> getBookingListFromCSV() {
        List<Booking> bookingList = new ArrayList<>();
        List<String> bookingString = myReadFromCSV(BOOKING_LOCAL_FILE);
        String[] pointer = null;

        for (String s : bookingString) {
            pointer = s.split(",");
            Booking booking = new Booking(pointer[0], LocalDate.parse(pointer[1]),
                    LocalDate.parse(pointer[2]), LocalDate.parse(pointer[3]),
                    pointer[4], pointer[5]);
            bookingList.add(booking);
        }
        return bookingList;
    }

    private List<Contract> getContractListFromCSV() {
        List<Contract> contractList = new ArrayList<>();
        List<String> contractString = myReadFromCSV(CONTRACT_LOCAL_FILE);
        String[] pointer = null;

        for (String s : contractString) {
            pointer = s.split(",");
            Contract contract = new Contract(LocalDate.parse(pointer[0]), LocalDate.parse(pointer[1]),
                    LocalDate.parse(pointer[2]), pointer[3], pointer[4], pointer[5]
                    , pointer[6], Double.parseDouble(pointer[7]), Double.parseDouble(pointer[8]));
            contractList.add(contract);
        }
        return contractList;
    }
}
