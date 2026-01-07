{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 39,
      "end_line": 327,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.\n *\n * @author Sean Schofield\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Fredrik Westermarck\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.FastDateFormatTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 62)",
        "(line 47,col 9)-(line 47,col 62)",
        "(line 48,col 9)-(line 48,col 37)",
        "(line 49,col 9)-(line 49,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String()",
      "begin_line": 52,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 74)",
        "(line 54,col 9)-(line 54,col 74)",
        "(line 55,col 9)-(line 55,col 74)",
        "(line 57,col 9)-(line 57,col 39)",
        "(line 58,col 9)-(line 58,col 37)",
        "(line 59,col 9)-(line 59,col 57)",
        "(line 60,col 9)-(line 60,col 67)",
        "(line 61,col 9)-(line 61,col 67)",
        "(line 62,col 9)-(line 62,col 68)",
        "(line 63,col 9)-(line 63,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone()",
      "begin_line": 66,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 55)",
        "(line 68,col 9)-(line 68,col 57)",
        "(line 69,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_Locale()",
      "begin_line": 96,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 55)",
        "(line 98,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateInstance()",
      "begin_line": 113,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 55)",
        "(line 115,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateTimeInstance()",
      "begin_line": 133,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale()",
      "begin_line": 153,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 55)",
        "(line 155,col 9)-(line 155,col 57)",
        "(line 156,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testFormat()",
      "begin_line": 183,
      "end_line": 183,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testShortDateStyleWithLocales()",
      "begin_line": 247,
      "end_line": 258,
      "comment": "\n     * Test case for {@link FastDateFormat#getDateInstance(int, java.util.Locale)}.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 249,col 54)",
        "(line 250,col 9)-(line 250,col 46)",
        "(line 251,col 9)-(line 251,col 28)",
        "(line 252,col 9)-(line 252,col 92)",
        "(line 253,col 9)-(line 253,col 48)",
        "(line 255,col 9)-(line 255,col 82)",
        "(line 256,col 9)-(line 256,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLowYearPadding()",
      "begin_line": 263,
      "end_line": 275,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 46)",
        "(line 265,col 9)-(line 265,col 73)",
        "(line 267,col 9)-(line 267,col 23)",
        "(line 268,col 9)-(line 268,col 55)",
        "(line 269,col 9)-(line 269,col 24)",
        "(line 270,col 9)-(line 270,col 55)",
        "(line 271,col 9)-(line 271,col 25)",
        "(line 272,col 9)-(line 272,col 55)",
        "(line 273,col 9)-(line 273,col 25)",
        "(line 274,col 9)-(line 274,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testMilleniumBug()",
      "begin_line": 279,
      "end_line": 285,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 46)",
        "(line 281,col 9)-(line 281,col 73)",
        "(line 283,col 9)-(line 283,col 26)",
        "(line 284,col 9)-(line 284,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testSimpleDate()",
      "begin_line": 292,
      "end_line": 302,
      "comment": " TODO: Fix this problem",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 294,col 73)",
        "(line 296,col 9)-(line 296,col 28)",
        "(line 297,col 9)-(line 297,col 55)",
        "(line 298,col 9)-(line 298,col 27)",
        "(line 299,col 9)-(line 299,col 55)",
        "(line 300,col 9)-(line 300,col 23)",
        "(line 301,col 9)-(line 301,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLang303()",
      "begin_line": 304,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 46)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 308,col 9)-(line 308,col 73)",
        "(line 309,col 9)-(line 309,col 43)",
        "(line 311,col 9)-(line 311,col 107)",
        "(line 312,col 9)-(line 312,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLang538()",
      "begin_line": 315,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 59)",
        "(line 320,col 9)-(line 320,col 85)",
        "(line 321,col 9)-(line 321,col 20)",
        "(line 322,col 9)-(line 322,col 40)",
        "(line 324,col 9)-(line 324,col 120)",
        "(line 325,col 9)-(line 325,col 63)"
      ]
    }
  ]
}