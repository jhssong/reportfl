{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 322,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.FastDateFormatTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 42,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 62)",
        "(line 44,col 9)-(line 44,col 62)",
        "(line 45,col 9)-(line 45,col 37)",
        "(line 46,col 9)-(line 46,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String()",
      "begin_line": 49,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 74)",
        "(line 51,col 9)-(line 51,col 74)",
        "(line 52,col 9)-(line 52,col 74)",
        "(line 54,col 9)-(line 54,col 39)",
        "(line 55,col 9)-(line 55,col 37)",
        "(line 56,col 9)-(line 56,col 57)",
        "(line 57,col 9)-(line 57,col 67)",
        "(line 58,col 9)-(line 58,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone()",
      "begin_line": 61,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 55)",
        "(line 63,col 9)-(line 63,col 57)",
        "(line 64,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_Locale()",
      "begin_line": 89,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateInstance()",
      "begin_line": 106,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 55)",
        "(line 108,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateTimeInstance()",
      "begin_line": 126,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale()",
      "begin_line": 146,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 55)",
        "(line 148,col 9)-(line 148,col 57)",
        "(line 149,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testFormat()",
      "begin_line": 173,
      "end_line": 173,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testShortDateStyleWithLocales()",
      "begin_line": 232,
      "end_line": 243,
      "comment": "\n     * Test case for {@link FastDateFormat#getDateInstance(int, java.util.Locale)}.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 234,col 54)",
        "(line 235,col 9)-(line 235,col 46)",
        "(line 236,col 9)-(line 236,col 28)",
        "(line 237,col 9)-(line 237,col 92)",
        "(line 238,col 9)-(line 238,col 48)",
        "(line 240,col 9)-(line 240,col 82)",
        "(line 241,col 9)-(line 241,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLowYearPadding()",
      "begin_line": 248,
      "end_line": 260,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 46)",
        "(line 250,col 9)-(line 250,col 73)",
        "(line 252,col 9)-(line 252,col 23)",
        "(line 253,col 9)-(line 253,col 55)",
        "(line 254,col 9)-(line 254,col 24)",
        "(line 255,col 9)-(line 255,col 55)",
        "(line 256,col 9)-(line 256,col 25)",
        "(line 257,col 9)-(line 257,col 55)",
        "(line 258,col 9)-(line 258,col 25)",
        "(line 259,col 9)-(line 259,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testMilleniumBug()",
      "begin_line": 264,
      "end_line": 270,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 46)",
        "(line 266,col 9)-(line 266,col 73)",
        "(line 268,col 9)-(line 268,col 26)",
        "(line 269,col 9)-(line 269,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testSimpleDate()",
      "begin_line": 276,
      "end_line": 286,
      "comment": "\n     * testLowYearPadding showed that the date was buggy\n     * This test confirms it, getting 366 back as a date\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 46)",
        "(line 278,col 9)-(line 278,col 73)",
        "(line 280,col 9)-(line 280,col 28)",
        "(line 281,col 9)-(line 281,col 55)",
        "(line 282,col 9)-(line 282,col 27)",
        "(line 283,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 284,col 23)",
        "(line 285,col 9)-(line 285,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLang303()",
      "begin_line": 288,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 46)",
        "(line 290,col 9)-(line 290,col 28)",
        "(line 292,col 9)-(line 292,col 73)",
        "(line 293,col 9)-(line 293,col 43)",
        "(line 295,col 9)-(line 295,col 107)",
        "(line 296,col 9)-(line 296,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLang538()",
      "begin_line": 299,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 85)",
        "(line 303,col 9)-(line 303,col 20)",
        "(line 304,col 9)-(line 304,col 40)",
        "(line 306,col 9)-(line 306,col 120)",
        "(line 307,col 9)-(line 307,col 91)",
        "(line 308,col 9)-(line 308,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLang645()",
      "begin_line": 311,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 47)",
        "(line 314,col 9)-(line 314,col 46)",
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 316,col 31)",
        "(line 318,col 9)-(line 318,col 83)",
        "(line 320,col 9)-(line 320,col 55)"
      ]
    }
  ]
}