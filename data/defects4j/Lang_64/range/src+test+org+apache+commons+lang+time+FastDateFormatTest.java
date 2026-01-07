{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 39,
      "end_line": 282,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.time.FastDateFormat}.\n *\n * @author Sean Schofield\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Fredrik Westermarck\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.FastDateFormatTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.main(java.lang.String[])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.suite()",
      "begin_line": 49,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 66)",
        "(line 51,col 9)-(line 51,col 46)",
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.setUp()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.tearDown()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 64,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 62)",
        "(line 66,col 9)-(line 66,col 62)",
        "(line 67,col 9)-(line 67,col 37)",
        "(line 68,col 9)-(line 68,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String()",
      "begin_line": 71,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 74)",
        "(line 73,col 9)-(line 73,col 74)",
        "(line 74,col 9)-(line 74,col 74)",
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 37)",
        "(line 78,col 9)-(line 78,col 57)",
        "(line 79,col 9)-(line 79,col 67)",
        "(line 80,col 9)-(line 80,col 67)",
        "(line 81,col 9)-(line 81,col 68)",
        "(line 82,col 9)-(line 82,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_TimeZone()",
      "begin_line": 85,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 55)",
        "(line 87,col 9)-(line 87,col 57)",
        "(line 88,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_Locale()",
      "begin_line": 115,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 55)",
        "(line 117,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale()",
      "begin_line": 132,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 55)",
        "(line 134,col 9)-(line 134,col 57)",
        "(line 135,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testFormat()",
      "begin_line": 162,
      "end_line": 162,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testShortDateStyleWithLocales()",
      "begin_line": 226,
      "end_line": 237,
      "comment": "\n     * Test case for {@link FastDateFormat#getDateInstance(int, java.util.Locale)}.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 36)",
        "(line 228,col 9)-(line 228,col 54)",
        "(line 229,col 9)-(line 229,col 46)",
        "(line 230,col 9)-(line 230,col 28)",
        "(line 231,col 9)-(line 231,col 92)",
        "(line 232,col 9)-(line 232,col 48)",
        "(line 234,col 9)-(line 234,col 82)",
        "(line 235,col 9)-(line 235,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testLowYearPadding()",
      "begin_line": 242,
      "end_line": 254,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 46)",
        "(line 244,col 9)-(line 244,col 73)",
        "(line 246,col 9)-(line 246,col 23)",
        "(line 247,col 9)-(line 247,col 55)",
        "(line 248,col 9)-(line 248,col 24)",
        "(line 249,col 9)-(line 249,col 55)",
        "(line 250,col 9)-(line 250,col 25)",
        "(line 251,col 9)-(line 251,col 55)",
        "(line 252,col 9)-(line 252,col 25)",
        "(line 253,col 9)-(line 253,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testMilleniumBug()",
      "begin_line": 258,
      "end_line": 264,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 46)",
        "(line 260,col 9)-(line 260,col 73)",
        "(line 262,col 9)-(line 262,col 26)",
        "(line 263,col 9)-(line 263,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testSimpleDate()",
      "begin_line": 271,
      "end_line": 281,
      "comment": " TODO: Fix this problem",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 273,col 73)",
        "(line 275,col 9)-(line 275,col 28)",
        "(line 276,col 9)-(line 276,col 55)",
        "(line 277,col 9)-(line 277,col 27)",
        "(line 278,col 9)-(line 278,col 55)",
        "(line 279,col 9)-(line 279,col 23)",
        "(line 280,col 9)-(line 280,col 55)"
      ]
    }
  ]
}