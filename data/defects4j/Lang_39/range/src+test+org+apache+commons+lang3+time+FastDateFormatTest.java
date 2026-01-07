{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 338,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.\n *\n * @author Sean Schofield\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Fredrik Westermarck\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.FastDateFormatTest(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.main(java.lang.String[])",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.suite()",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 66)",
        "(line 54,col 9)-(line 54,col 46)",
        "(line 56,col 9)-(line 56,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.setUp()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.tearDown()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 69,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 62)",
        "(line 71,col 9)-(line 71,col 62)",
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 73,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String()",
      "begin_line": 76,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 74)",
        "(line 78,col 9)-(line 78,col 74)",
        "(line 79,col 9)-(line 79,col 74)",
        "(line 81,col 9)-(line 81,col 39)",
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 83,col 57)",
        "(line 84,col 9)-(line 84,col 67)",
        "(line 85,col 9)-(line 85,col 67)",
        "(line 86,col 9)-(line 86,col 68)",
        "(line 87,col 9)-(line 87,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone()",
      "begin_line": 90,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 55)",
        "(line 92,col 9)-(line 92,col 57)",
        "(line 93,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_Locale()",
      "begin_line": 120,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 55)",
        "(line 122,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateInstance()",
      "begin_line": 137,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 55)",
        "(line 139,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateTimeInstance()",
      "begin_line": 157,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 55)",
        "(line 159,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale()",
      "begin_line": 177,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 55)",
        "(line 179,col 9)-(line 179,col 57)",
        "(line 180,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testFormat()",
      "begin_line": 207,
      "end_line": 207,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testShortDateStyleWithLocales()",
      "begin_line": 271,
      "end_line": 282,
      "comment": "\n     * Test case for {@link FastDateFormat#getDateInstance(int, java.util.Locale)}.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 36)",
        "(line 273,col 9)-(line 273,col 54)",
        "(line 274,col 9)-(line 274,col 46)",
        "(line 275,col 9)-(line 275,col 28)",
        "(line 276,col 9)-(line 276,col 92)",
        "(line 277,col 9)-(line 277,col 48)",
        "(line 279,col 9)-(line 279,col 82)",
        "(line 280,col 9)-(line 280,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLowYearPadding()",
      "begin_line": 287,
      "end_line": 299,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 46)",
        "(line 289,col 9)-(line 289,col 73)",
        "(line 291,col 9)-(line 291,col 23)",
        "(line 292,col 9)-(line 292,col 55)",
        "(line 293,col 9)-(line 293,col 24)",
        "(line 294,col 9)-(line 294,col 55)",
        "(line 295,col 9)-(line 295,col 25)",
        "(line 296,col 9)-(line 296,col 55)",
        "(line 297,col 9)-(line 297,col 25)",
        "(line 298,col 9)-(line 298,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testMilleniumBug()",
      "begin_line": 303,
      "end_line": 309,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 46)",
        "(line 305,col 9)-(line 305,col 73)",
        "(line 307,col 9)-(line 307,col 26)",
        "(line 308,col 9)-(line 308,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testSimpleDate()",
      "begin_line": 316,
      "end_line": 326,
      "comment": " TODO: Fix this problem",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 46)",
        "(line 318,col 9)-(line 318,col 73)",
        "(line 320,col 9)-(line 320,col 28)",
        "(line 321,col 9)-(line 321,col 55)",
        "(line 322,col 9)-(line 322,col 27)",
        "(line 323,col 9)-(line 323,col 55)",
        "(line 324,col 9)-(line 324,col 23)",
        "(line 325,col 9)-(line 325,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testLang303()",
      "begin_line": 328,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 46)",
        "(line 330,col 9)-(line 330,col 28)",
        "(line 332,col 9)-(line 332,col 73)",
        "(line 333,col 9)-(line 333,col 43)",
        "(line 335,col 9)-(line 335,col 107)",
        "(line 336,col 9)-(line 336,col 49)"
      ]
    }
  ]
}