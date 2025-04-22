package com.xworkz.external2;

import com.xworkz.internal.rules2.*;
import com.xworkz.internal.rules2.CloudService;

public class GoogleDrive implements CloudService {
    public void upload() {
        System.out.println("File uploaded");
    }
    public void download() {
        System.out.println("File downloaded");
    }
    public void sync() {
        System.out.println("Files synced");
    }
    public void delete() {
        System.out.println("File deleted");
    }
    public void monitor() {
        System.out.println("Storage monitored");
    }
}