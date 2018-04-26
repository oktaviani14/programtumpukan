class ProgramTumpukan {
    static int atas = -1;
    static int batasAtas = 4;
    
    public static void push (String tumpukan[], String data) {
        if (atas >= batasAtas)
                System.out.println("Tumpukan penuh.");
        else {
            System.out.println("PUSH : " + data);
            atas = atas + 1;
            tumpukan[atas] = data;
        }
    }
    
    public static String pop (String tumpukan[]) {
        String hasilPop = " ";
        if (atas < 0) 
			hasilPop = "Tumpukan kosong";
        else {
            hasilPop = tumpukan[atas];
            tumpukan[atas] = null;
            atas--;
        }
        return hasilPop;
    }
    
    public static void bacaTumpukan (String tumpukan[]) {
        System.out.println("Kondisi tumpukan : ");
        for (int i = batasAtas; i >= 0; i--) {
            if (i == atas)
				System.out.println(i + "." + tumpukan[i] + " atas");
            else 
				System.out.println(i + "." + tumpukan[i]);
        }
    }
    
    public static void cleanTumpukan (String tumpukan[]) {
		System.out.println("Bersihkan semua tumpukan");
                for (int i = batasAtas; i >= 0; i--) {
                    pop(tumpukan);
                }
    }
    public static void main (String args[]) {
        String tumpukan[] = new String[5];
		push(tumpukan, "BUKU A");
		push(tumpukan, "BUKU B");
		System.out.println();
		bacaTumpukan(tumpukan);
		System.out.println();
		cleanTumpukan(tumpukan);
		bacaTumpukan(tumpukan);
        System.out.println();
        push(tumpukan, "BUKU C");
        push(tumpukan, "BUKU D");
		System.out.println();
        bacaTumpukan(tumpukan);
        System.out.println("POP : " + pop(tumpukan));
		System.out.println();
        bacaTumpukan(tumpukan);
		push(tumpukan, "BUKU E");
        System.out.println();
        bacaTumpukan(tumpukan);
        System.out.println();
        bacaTumpukan(tumpukan);
        System.out.println();
        System.out.println("POP : " + pop(tumpukan));
        bacaTumpukan(tumpukan);
        cleanTumpukan(tumpukan);
		System.out.println();
        bacaTumpukan(tumpukan);
    }
}