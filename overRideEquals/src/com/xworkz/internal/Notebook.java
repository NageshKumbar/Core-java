package com.xworkz.internal;

import java.util.Objects;

public class Notebook {
    int pages;
    String size;
    boolean ruled;
    boolean hardcover;

    public Notebook(int pages, String size, boolean ruled, boolean hardcover) {
        this.pages = pages;
        this.size = size;
        this.ruled = ruled;
        this.hardcover = hardcover;
    }

    @Override
    public String toString() {
        return "Pages = " + pages + ", Size = " + size + ", Ruled = " + ruled + ", Hardcover = " + hardcover;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Notebook) {
            Notebook notebook = (Notebook) obj;
            if (Objects.equals(this.pages, notebook.pages) && Objects.equals(this.size, notebook.size) && Objects.equals(this.ruled, notebook.ruled) && Objects.equals(this.hardcover, notebook.hardcover)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
