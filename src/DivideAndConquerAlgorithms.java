import java.util.List;

public class DivideAndConquerAlgorithms {
    public int binarySearch(List<Integer> searchList, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (searchList.get(mid) == target) {
            return mid;
        }

        if (searchList.get(mid) < target) {
            return binarySearch(searchList, left, mid - 1, target);
        }
        return binarySearch(searchList, mid + 1, right, target);
    }
}
