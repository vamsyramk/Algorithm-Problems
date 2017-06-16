int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    int l = statues.length;
    int d = statues[l -1] - statues[0]+1;
    System.out.println(d);
    return d-l;
}