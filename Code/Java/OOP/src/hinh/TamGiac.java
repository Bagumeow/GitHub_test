package hinh;

public class TamGiac {
    private float ma;
    private float mb;
    private float mc;

    private boolean CheckTamGiac(float ma, float mb, float mc) {
        if (ma + mb > mc && mb + mc > ma && ma + mc > mb)
            return true;
        else {
            return false;
        }
    }

    public TamGiac() {
        this(0, 0, 0);
    }

    public TamGiac(float ma, float mb, float mc) {
        if (CheckTamGiac(ma, mb, mc) && (ma > 0 && mb > 0 && mc > 0)) {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        } else {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;

        }
    }

    public void setMa(float ma) {
        if (ma > 0 && CheckTamGiac(ma, this.mb, this.mc))
            this.ma = ma;
    }

    public float getMa() {
        return ma;
    }

    public void setMb(float mb) {
        if (mb > 0 && CheckTamGiac(this.ma, mb, this.mc))
            this.mb = mb;
    }

    public float getMb() {
        return mb;
    }

    public void setMc(float mc) {
        if (mc >= 0 && CheckTamGiac(this.ma, this.mb, mc)) {
            this.mc = mc;
        }
    }

    public float getMc() {
        return mc;
    }

    public float tinhDienTich() {
        float p = (ma + mb + mc) / 2;
        return (float) Math.sqrt(p * (p - ma) * (p - mb) * p - mc);
    }

    public float tinhChuvi() {
        return ma + mb + mc;
    }

    public String timThongTin() {
        if (ma == 0 || mb == 0 || mc == 0) {
            return String.format("Day khong phai tam giac");
        } else if (ma == mb && mb == mc) {
            return String.format("Day la tam giac deu");
        } else if (ma == mb || ma == mc || mb == mc) {
            return String.format("Day la tam giac can");
        } else if ((ma + mb > mc) && (mb + mc > ma) && (ma + mc > mb)) {
            return String.format("Day la tam giac thuong");
        } else {
            return String.format("Day khong phai tam giac");
        }
    }

    public String toString() {
        return String.format("%-10.2f %-10.2f %-10.2f %-10.2f %-15.2f %-25s", ma, mb, mc, tinhChuvi(), tinhDienTich(),
                timThongTin());
    }
}
