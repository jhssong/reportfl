{
  "filepath": "/tmp/Lang-5b/src/test/java/org/apache/commons/lang3/time/FastDatePrinterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDatePrinterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 291,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDatePrinter}.\n *\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "YYYY_MM_DD"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NEW_YORK"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SWEDEN"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getDateInstance(int, java.util.Locale)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 145)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Override this method in derived tests to change the construction of instances\n     * @param format\n     * @param timeZone\n     * @param locale\n     * @return\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testFormat()",
      "begin_line": 73,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 55)",
        "(line 76,col 9)-(line 76,col 57)",
        "(line 77,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testShortDateStyleWithLocales()",
      "begin_line": 132,
      "end_line": 144,
      "comment": "\n     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 54)",
        "(line 136,col 9)-(line 136,col 46)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 138,col 9)-(line 138,col 74)",
        "(line 139,col 9)-(line 139,col 48)",
        "(line 141,col 9)-(line 141,col 67)",
        "(line 142,col 9)-(line 142,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLowYearPadding()",
      "begin_line": 149,
      "end_line": 162,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 46)",
        "(line 152,col 9)-(line 152,col 53)",
        "(line 154,col 9)-(line 154,col 23)",
        "(line 155,col 9)-(line 155,col 55)",
        "(line 156,col 9)-(line 156,col 24)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 25)",
        "(line 159,col 9)-(line 159,col 55)",
        "(line 160,col 9)-(line 160,col 25)",
        "(line 161,col 9)-(line 161,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testMilleniumBug()",
      "begin_line": 166,
      "end_line": 173,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 46)",
        "(line 169,col 9)-(line 169,col 55)",
        "(line 171,col 9)-(line 171,col 26)",
        "(line 172,col 9)-(line 172,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testSimpleDate()",
      "begin_line": 179,
      "end_line": 190,
      "comment": "\n     * testLowYearPadding showed that the date was buggy\n     * This test confirms it, getting 366 back as a date\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 46)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 184,col 9)-(line 184,col 28)",
        "(line 185,col 9)-(line 185,col 55)",
        "(line 186,col 9)-(line 186,col 27)",
        "(line 187,col 9)-(line 187,col 55)",
        "(line 188,col 9)-(line 188,col 23)",
        "(line 189,col 9)-(line 189,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLang303()",
      "begin_line": 192,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 195,col 30)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 198,col 43)",
        "(line 200,col 9)-(line 200,col 101)",
        "(line 201,col 9)-(line 201,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLang538()",
      "begin_line": 204,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 85)",
        "(line 209,col 9)-(line 209,col 20)",
        "(line 210,col 9)-(line 210,col 40)",
        "(line 212,col 9)-(line 212,col 102)",
        "(line 213,col 9)-(line 213,col 91)",
        "(line 214,col 9)-(line 214,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLang645()",
      "begin_line": 217,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 47)",
        "(line 221,col 9)-(line 221,col 46)",
        "(line 222,col 9)-(line 222,col 38)",
        "(line 223,col 9)-(line 223,col 31)",
        "(line 225,col 9)-(line 225,col 65)",
        "(line 227,col 9)-(line 227,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testEquals()",
      "begin_line": 230,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 54)",
        "(line 233,col 9)-(line 233,col 54)",
        "(line 235,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 236,col 63)",
        "(line 238,col 9)-(line 238,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testToStringContainsName()",
      "begin_line": 241,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 53)",
        "(line 244,col 9)-(line 244,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testPatternMatches()",
      "begin_line": 247,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 53)",
        "(line 250,col 9)-(line 250,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLocaleMatches()",
      "begin_line": 253,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 61)",
        "(line 256,col 9)-(line 256,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testTimeZoneMatches()",
      "begin_line": 259,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 63)",
        "(line 262,col 9)-(line 262,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testCalendarTimezoneRespected()",
      "begin_line": 265,
      "end_line": 266,
      "comment": "",
      "child_ranges": []
    }
  ]
}