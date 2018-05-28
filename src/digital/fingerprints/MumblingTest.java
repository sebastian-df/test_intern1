package digital.fingerprints;

import org.junit.Test;

import static org.junit.Assert.*;

public class MumblingTest {

    @Test
    public void mumbleTest() {
        assertEquals("A-Bb-Ccc-Dddd", Mumbling.mumble("abcd"));
        assertEquals("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", Mumbling.mumble("RqaEzty"));
        assertEquals("C-Ww-Aaa-Tttt", Mumbling.mumble("cwAt"));
        assertEquals(null, Mumbling.mumble("123"));
        assertEquals(null, Mumbling.mumble("*@!#@"));
        assertEquals("", Mumbling.mumble(""));

        assertEquals("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu", Mumbling.mumble("ZpglnRxqenU"));
        assertEquals("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb", Mumbling.mumble("NyffsGeyylB"));
        assertEquals("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu", Mumbling.mumble("MjtkuBovqrU"));
        assertEquals("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm", Mumbling.mumble("EvidjUnokmM"));
        assertEquals("H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc", Mumbling.mumble("HbideVbxncC"));
    }
}