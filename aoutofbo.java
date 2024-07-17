class aoutofbo{
    public static void main(String[] args) {
        try{
        int []arr = new int[5];
        throw new ArrayIndexOutOfBoundsException("Out of box thinking is needed");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}