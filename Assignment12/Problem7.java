class Problem7 {
    public static void main(String[] args) {
        try {
            if (args.length != 2)
                throw new ArrayIndexOutOfBoundsException("Please enter exactly 2 arguments");
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Sum: " + (a + b));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Arguments must be integers");
        }
    }
}
