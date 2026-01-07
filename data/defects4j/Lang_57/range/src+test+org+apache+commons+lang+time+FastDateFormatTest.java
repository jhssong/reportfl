{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 283,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.time.FastDateFormat}.\n *\n * @author Sean Schofield\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Fredrik Westermarck\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.FastDateFormatTest(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.main(java.lang.String[])",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.suite()",
      "begin_line": 50,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 66)",
        "(line 52,col 9)-(line 52,col 46)",
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.setUp()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.tearDown()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 62)",
        "(line 67,col 9)-(line 67,col 62)",
        "(line 68,col 9)-(line 68,col 37)",
        "(line 69,col 9)-(line 69,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String()",
      "begin_line": 72,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 74)",
        "(line 74,col 9)-(line 74,col 74)",
        "(line 75,col 9)-(line 75,col 74)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 37)",
        "(line 79,col 9)-(line 79,col 57)",
        "(line 80,col 9)-(line 80,col 67)",
        "(line 81,col 9)-(line 81,col 67)",
        "(line 82,col 9)-(line 82,col 68)",
        "(line 83,col 9)-(line 83,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_TimeZone()",
      "begin_line": 86,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 88,col 57)",
        "(line 89,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_Locale()",
      "begin_line": 116,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 55)",
        "(line 118,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale()",
      "begin_line": 133,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 135,col 57)",
        "(line 136,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testFormat()",
      "begin_line": 163,
      "end_line": 163,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testShortDateStyleWithLocales()",
      "begin_line": 227,
      "end_line": 238,
      "comment": "\n     * Test case for {@link FastDateFormat#getDateInstance(int, java.util.Locale)}.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 36)",
        "(line 229,col 9)-(line 229,col 54)",
        "(line 230,col 9)-(line 230,col 46)",
        "(line 231,col 9)-(line 231,col 28)",
        "(line 232,col 9)-(line 232,col 92)",
        "(line 233,col 9)-(line 233,col 48)",
        "(line 235,col 9)-(line 235,col 82)",
        "(line 236,col 9)-(line 236,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testLowYearPadding()",
      "begin_line": 243,
      "end_line": 255,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 46)",
        "(line 245,col 9)-(line 245,col 73)",
        "(line 247,col 9)-(line 247,col 23)",
        "(line 248,col 9)-(line 248,col 55)",
        "(line 249,col 9)-(line 249,col 24)",
        "(line 250,col 9)-(line 250,col 55)",
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 252,col 55)",
        "(line 253,col 9)-(line 253,col 25)",
        "(line 254,col 9)-(line 254,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testMilleniumBug()",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\n     * Show Bug #39410 is solved\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 46)",
        "(line 261,col 9)-(line 261,col 73)",
        "(line 263,col 9)-(line 263,col 26)",
        "(line 264,col 9)-(line 264,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormatTest.testSimpleDate()",
      "begin_line": 272,
      "end_line": 282,
      "comment": " TODO: Fix this problem",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 46)",
        "(line 274,col 9)-(line 274,col 73)",
        "(line 276,col 9)-(line 276,col 28)",
        "(line 277,col 9)-(line 277,col 55)",
        "(line 278,col 9)-(line 278,col 27)",
        "(line 279,col 9)-(line 279,col 55)",
        "(line 280,col 9)-(line 280,col 23)",
        "(line 281,col 9)-(line 281,col 55)"
      ]
    }
  ]
}