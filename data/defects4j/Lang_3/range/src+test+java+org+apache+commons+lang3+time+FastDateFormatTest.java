{
  "filepath": "/tmp/Lang-3b/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 313,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 52,
      "end_line": 57,
      "comment": "\n     * Only the cache methods need to be tested here.  \n     * The print methods are tested by {@link FastDateFormat_PrinterTest}\n     * and the parse methods are tested by {@link FastDateFormat_ParserTest}\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 68)",
        "(line 55,col 9)-(line 55,col 68)",
        "(line 56,col 9)-(line 56,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String()",
      "begin_line": 59,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 80)",
        "(line 62,col 9)-(line 62,col 80)",
        "(line 63,col 9)-(line 63,col 80)",
        "(line 65,col 9)-(line 65,col 39)",
        "(line 66,col 9)-(line 66,col 37)",
        "(line 67,col 9)-(line 67,col 57)",
        "(line 68,col 9)-(line 68,col 67)",
        "(line 69,col 9)-(line 69,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone()",
      "begin_line": 72,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 61)",
        "(line 75,col 9)-(line 75,col 63)",
        "(line 76,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_Locale()",
      "begin_line": 101,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 61)",
        "(line 104,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateInstance()",
      "begin_line": 119,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 61)",
        "(line 122,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateTimeInstance()",
      "begin_line": 140,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 61)",
        "(line 143,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale()",
      "begin_line": 161,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 61)",
        "(line 164,col 9)-(line 164,col 63)",
        "(line 165,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testCheckDefaults()",
      "begin_line": 189,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 67)",
        "(line 192,col 9)-(line 192,col 117)",
        "(line 193,col 9)-(line 193,col 37)",
        "(line 195,col 9)-(line 195,col 60)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 198,col 9)-(line 198,col 62)",
        "(line 199,col 9)-(line 199,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testCheckDifferingStyles()",
      "begin_line": 202,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 132)",
        "(line 205,col 9)-(line 205,col 130)",
        "(line 206,col 9)-(line 206,col 130)",
        "(line 207,col 9)-(line 207,col 128)",
        "(line 209,col 9)-(line 209,col 50)",
        "(line 210,col 9)-(line 210,col 50)",
        "(line 211,col 9)-(line 211,col 49)",
        "(line 212,col 9)-(line 212,col 49)",
        "(line 213,col 9)-(line 213,col 48)",
        "(line 214,col 9)-(line 214,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testDateDefaults()",
      "begin_line": 217,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 220,col 107)",
        "(line 222,col 9)-(line 223,col 132)",
        "(line 225,col 9)-(line 226,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testTimeDefaults()",
      "begin_line": 229,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 232,col 107)",
        "(line 234,col 9)-(line 235,col 132)",
        "(line 237,col 9)-(line 238,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testTimeDateDefaults()",
      "begin_line": 241,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 244,col 134)",
        "(line 246,col 9)-(line 247,col 159)",
        "(line 249,col 9)-(line 250,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.testParseSync()",
      "begin_line": 253,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 61)",
        "(line 256,col 9)-(line 256,col 76)",
        "(line 258,col 9)-(line 267,col 11)",
        "(line 269,col 9)-(line 269,col 88)",
        "(line 271,col 9)-(line 271,col 106)",
        "(line 272,col 9)-(line 272,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": " because SimpleDateFormat is serializable"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.Anonymous-9191bfe5-2996-41e5-bd45-60c21b6596be.parseObject(java.lang.String)",
      "begin_line": 261,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 263,col 29)-(line 265,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NTHREADS"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NROUNDS"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.measureTime(java.text.Format, java.text.Format)",
      "begin_line": 278,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 76)",
        "(line 280,col 9)-(line 280,col 59)",
        "(line 281,col 9)-(line 281,col 57)",
        "(line 283,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 24)",
        "(line 306,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 40)",
        "(line 311,col 9)-(line 311,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.Anonymous-c6513710-d5d6-4a9d-8983-26821732586a.run()",
      "begin_line": 285,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 287,col 21)-(line 301,col 21)"
      ]
    }
  ]
}