{
  "filepath": "/tmp/Lang-12b/src/test/java/org/apache/commons/lang3/time/FastDatePrinterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDatePrinterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 263,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDatePrinter}.\n *\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "YYYY_MM_DD"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NEW_YORK"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SWEDEN"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getDateInstance(int, java.util.Locale)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Override this method in derived tests to change the construction of instances\n     * @param format\n     * @param timeZone\n     * @param locale\n     * @return\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testFormat()",
      "begin_line": 72,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 55)",
        "(line 75,col 9)-(line 75,col 57)",
        "(line 76,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testShortDateStyleWithLocales()",
      "begin_line": 131,
      "end_line": 143,
      "comment": "\n     * Test case for {@link FastDatePrinter#getDateInstance(int, java.util.Locale)}.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 54)",
        "(line 135,col 9)-(line 135,col 46)",
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 137,col 74)",
        "(line 138,col 9)-(line 138,col 48)",
        "(line 140,col 9)-(line 140,col 67)",
        "(line 141,col 9)-(line 141,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLowYearPadding()",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 46)",
        "(line 151,col 9)-(line 151,col 53)",
        "(line 153,col 9)-(line 153,col 23)",
        "(line 154,col 9)-(line 154,col 55)",
        "(line 155,col 9)-(line 155,col 24)",
        "(line 156,col 9)-(line 156,col 55)",
        "(line 157,col 9)-(line 157,col 25)",
        "(line 158,col 9)-(line 158,col 55)",
        "(line 159,col 9)-(line 159,col 25)",
        "(line 160,col 9)-(line 160,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testMilleniumBug()",
      "begin_line": 165,
      "end_line": 172,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 46)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 170,col 9)-(line 170,col 26)",
        "(line 171,col 9)-(line 171,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testSimpleDate()",
      "begin_line": 178,
      "end_line": 189,
      "comment": "\n     * testLowYearPadding showed that the date was buggy\n     * This test confirms it, getting 366 back as a date\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 46)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 183,col 9)-(line 183,col 28)",
        "(line 184,col 9)-(line 184,col 55)",
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 55)",
        "(line 187,col 9)-(line 187,col 23)",
        "(line 188,col 9)-(line 188,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLang303()",
      "begin_line": 191,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 46)",
        "(line 194,col 9)-(line 194,col 30)",
        "(line 196,col 9)-(line 196,col 53)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 199,col 9)-(line 199,col 101)",
        "(line 200,col 9)-(line 200,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLang538()",
      "begin_line": 203,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 85)",
        "(line 208,col 9)-(line 208,col 20)",
        "(line 209,col 9)-(line 209,col 40)",
        "(line 211,col 9)-(line 211,col 102)",
        "(line 212,col 9)-(line 212,col 91)",
        "(line 213,col 9)-(line 213,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLang645()",
      "begin_line": 216,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 47)",
        "(line 220,col 9)-(line 220,col 46)",
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 31)",
        "(line 224,col 9)-(line 224,col 65)",
        "(line 226,col 9)-(line 226,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testEquals()",
      "begin_line": 229,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 54)",
        "(line 232,col 9)-(line 232,col 54)",
        "(line 234,col 9)-(line 234,col 41)",
        "(line 235,col 9)-(line 235,col 63)",
        "(line 237,col 9)-(line 237,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testToStringContainsName()",
      "begin_line": 240,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 53)",
        "(line 243,col 9)-(line 243,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testPatternMatches()",
      "begin_line": 246,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 53)",
        "(line 249,col 9)-(line 249,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testLocaleMatches()",
      "begin_line": 252,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 61)",
        "(line 255,col 9)-(line 255,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinterTest.testTimeZoneMatches()",
      "begin_line": 258,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 63)",
        "(line 261,col 9)-(line 261,col 54)"
      ]
    }
  ]
}