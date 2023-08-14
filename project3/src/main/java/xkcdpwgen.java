import picocli.CommandLine;


@CommandLine.Command(
        name = "xkcd password generator",
        description = "generate"
)
public class xkcdpwgen implements Runnable {

  public static void main(String[] args) {
    CommandLine.run(new xkcdpwgen(), args);
  }


  @CommandLine.Option(names = {"-h"})
  @Override
  public void run() {
    System.out.println("usage: xkcdpwgen [-h] [-w WORDS] [-c CAPS] [-n NUMBERS] [-s SYMBOLS]\n" +
            "                \n" +
            "Generate a secure, memorable password using the XKCD method\n" +
            "                \n" +
            "optional arguments:\n" +
            "    -h, --help            show this help message and exit\n" +
            "    -w WORDS, --words WORDS\n" +
            "                          include WORDS words in the password (default=4)\n" +
            "    -c CAPS, --caps CAPS  capitalize the first letter of CAPS random words\n" +
            "                          (default=0)\n" +
            "    -n NUMBERS, --numbers NUMBERS\n" +
            "                          insert NUMBERS random numbers in the password\n" +
            "                          (default=0)\n" +
            "    -s SYMBOLS, --symbols SYMBOLS\n" +
            "                          insert SYMBOLS random symbols in the password\n" +
            "                          (default=0)");
  }


}