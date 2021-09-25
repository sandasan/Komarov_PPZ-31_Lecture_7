package Example_7_2;

import java.util.ArrayList;
import java.util.Arrays;

public class UsbDrive implements Comparable{

    private static String[] sortingFields; // for example: {"size", "brand", "type"}

    private ArrayList fieldName = new ArrayList<String>();
    private ArrayList fieldType = new ArrayList<String>();
    private ArrayList fieldValue = new ArrayList<Object>();

    public UsbDrive(int size, String brand, int type) {
        setSize(size);
        setBrand(brand);
        setType(type);
    }

    public int getSize() {
        int sizeIndex = fieldName.indexOf("size");
        int sizeValue = (Integer) fieldValue.get(sizeIndex);
        return sizeValue;
    }

    public void setSize(int size) {
        fieldName.add("size");
        fieldType.add("int");
        fieldValue.add(size);
    }

    public String getBrand() {
        int brandIndex = fieldName.indexOf("brand");
        String brandValue = String.valueOf(fieldValue.get(brandIndex));
        return brandValue;
    }

    public void setBrand(String brand) {
        fieldName.add("brand");
        fieldType.add("String");
        fieldValue.add(brand);
    }

    private int getIntValue(String fName) {
        int fIndex = fieldName.indexOf(fName);
        int fValue = (Integer) fieldValue.get(fIndex);
        return fValue;
    }

    private String getStringValue(String fName) {
        int fIndex = fieldName.indexOf(fName);
        String fValue = (String) fieldValue.get(fIndex);
        return fValue;
    }

    public int getType() {
        int typeIndex = fieldName.indexOf("type");
        int typeValue = (Integer) fieldValue.get(typeIndex);
        return typeValue;
    }

    public void setType(int type) {
        fieldName.add("type");
        fieldType.add("int");
        fieldValue.add(type);
    }

    public static void setSortingFields(String[] sortingFields) {
        UsbDrive.sortingFields = sortingFields;
    }

    @Override
    public int compareTo(Object o) {
        UsbDrive d = (UsbDrive) o;
        return compare(this, d);
    }
    
    private int compare(Object o1, Object o2) {
        UsbDrive d1 = (UsbDrive) o1;
        UsbDrive d2 = (UsbDrive) o2;
        int result = 0;
        // Если не "заказано" сортировки, возвращаем результат, как будто объекты одинаковые
        if (sortingFields == null) {
            return result;
        } else {
            // Проходим по полям для сортировки
            loop: for (String sortingField : sortingFields) {
                int sortingFieldIndex = fieldName.indexOf(sortingField);
                String sortingFieldType = String.valueOf(fieldType.get(sortingFieldIndex));
                switch (sortingFieldType) {
                    case "int":
                        int intValue1 = d1.getIntValue(sortingField);
                        int intValue2 = d2.getIntValue(sortingField);
                        // Сравниваем значения как числа и устанавливаем результат
                        if (intValue1 != intValue2) {
                            if (intValue1 < intValue2) {
                                result = -1;
                            } else {
                                result = 1;
                            }
                            break loop;
                        }
                        break;
                    case "String":
                        String stringValue1 = d1.getStringValue(sortingField);
                        String stringValue2 = d2.getStringValue(sortingField);
                        // Сравниваем значения как строки и устанавливаем результат
                        if (CharSequence.compare(stringValue1, stringValue2) != 0) {
                            if (CharSequence.compare(stringValue1, stringValue2) < 0) {
                                result = -1;
                            } else {
                                result = 1;
                            }
                            break loop;
                        }
                        break;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String size = String.valueOf(getSize());
        String brand = String.valueOf(getBrand());
        String type = String.valueOf(getType());
        return "UsbDrive{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                '}';
    }
}
