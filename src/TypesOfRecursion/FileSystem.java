/**
 * Created File System example for recursion
 * This program will tell us the total space occupied by the system by various programs
 * And it will add the total disk space taken by user.
 */
package TypesOfRecursion;

import java.io.File;

public class FileSystem {
    public static void main(String[] args) {
        diskUsageByUser(new File("You can specify on your own !!!"));
    }

    public static long diskUsageByUser(File root) {
        long total = root.length();
        if (root.isDirectory()) {


            for (String childname : root.list()) {
                File child = new File(root, childname);
                total = total + diskUsageByUser(child);

            }
        }
            System.out.println(total + "\t" + root);
            return total;
        }
    }
