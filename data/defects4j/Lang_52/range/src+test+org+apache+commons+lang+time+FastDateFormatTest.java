{
  "filepath": "/tmp/Lang-52b/src/test/org/apache/commons/lang/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 296,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.time.FastDateFormat}.\n *\n * @author Sean Schofield\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Fredrik Westermarck\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.FastDateFormatTest(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.main(java.lang.String[])",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.suite()",
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
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.setUp()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.tearDown()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 67,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 62)",
        "(line 69,col 9)-(line 69,col 62)",
        "(line 70,col 9)-(line 70,col 37)",
        "(line 71,col 9)-(line 71,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String()",
      "begin_line": 74,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 74)",
        "(line 76,col 9)-(line 76,col 74)",
        "(line 77,col 9)-(line 77,col 74)",
        "(line 79,col 9)-(line 79,col 39)",
        "(line 80,col 9)-(line 80,col 37)",
        "(line 81,col 9)-(line 81,col 57)",
        "(line 82,col 9)-(line 82,col 67)",
        "(line 83,col 9)-(line 83,col 67)",
        "(line 84,col 9)-(line 84,col 68)",
        "(line 85,col 9)-(line 85,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_TimeZone()",
      "begin_line": 88,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 55)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_Locale()",
      "begin_line": 118,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 55)",
        "(line 120,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale()",
      "begin_line": 135,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 55)",
        "(line 137,col 9)-(line 137,col 57)",
        "(line 138,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testFormat()",
      "begin_line": 165,
      "end_line": 165,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testShortDateStyleWithLocales()",
      "begin_line": 229,
      "end_line": 240,
      "comment": "\n     * Test case for {@link FastDateFormat#getDateInstance(int, java.util.Locale)}.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 36)",
        "(line 231,col 9)-(line 231,col 54)",
        "(line 232,col 9)-(line 232,col 46)",
        "(line 233,col 9)-(line 233,col 28)",
        "(line 234,col 9)-(line 234,col 92)",
        "(line 235,col 9)-(line 235,col 48)",
        "(line 237,col 9)-(line 237,col 82)",
        "(line 238,col 9)-(line 238,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testLowYearPadding()",
      "begin_line": 245,
      "end_line": 257,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 46)",
        "(line 247,col 9)-(line 247,col 73)",
        "(line 249,col 9)-(line 249,col 23)",
        "(line 250,col 9)-(line 250,col 55)",
        "(line 251,col 9)-(line 251,col 24)",
        "(line 252,col 9)-(line 252,col 55)",
        "(line 253,col 9)-(line 253,col 25)",
        "(line 254,col 9)-(line 254,col 55)",
        "(line 255,col 9)-(line 255,col 25)",
        "(line 256,col 9)-(line 256,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testMilleniumBug()",
      "begin_line": 261,
      "end_line": 267,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 46)",
        "(line 263,col 9)-(line 263,col 73)",
        "(line 265,col 9)-(line 265,col 26)",
        "(line 266,col 9)-(line 266,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testSimpleDate()",
      "begin_line": 274,
      "end_line": 284,
      "comment": " TODO: Fix this problem",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 46)",
        "(line 276,col 9)-(line 276,col 73)",
        "(line 278,col 9)-(line 278,col 28)",
        "(line 279,col 9)-(line 279,col 55)",
        "(line 280,col 9)-(line 280,col 27)",
        "(line 281,col 9)-(line 281,col 55)",
        "(line 282,col 9)-(line 282,col 23)",
        "(line 283,col 9)-(line 283,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testLang303()",
      "begin_line": 286,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 46)",
        "(line 288,col 9)-(line 288,col 28)",
        "(line 290,col 9)-(line 290,col 73)",
        "(line 291,col 9)-(line 291,col 43)",
        "(line 293,col 9)-(line 293,col 107)",
        "(line 294,col 9)-(line 294,col 49)"
      ]
    }
  ]
}