{
  "filepath": "/tmp/Lang-11b/src/test/java/org/apache/commons/lang3/time/FastDateFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormatTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 312,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance()",
      "begin_line": 52,
      "end_line": 57,
      "comment": "\n     * Only the cache methods need to be tested here.  \n     * The print methods are tested by {@link FastDateFormat_PrinterTest}\n     * and the parse methods are tested by {@link FastDateFormat_ParserTest}\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 62)",
        "(line 55,col 9)-(line 55,col 62)",
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
        "(line 61,col 9)-(line 61,col 74)",
        "(line 62,col 9)-(line 62,col 74)",
        "(line 63,col 9)-(line 63,col 74)",
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
        "(line 74,col 9)-(line 74,col 55)",
        "(line 75,col 9)-(line 75,col 57)",
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
        "(line 103,col 9)-(line 103,col 55)",
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
        "(line 121,col 9)-(line 121,col 55)",
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
        "(line 142,col 9)-(line 142,col 55)",
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
        "(line 163,col 9)-(line 163,col 55)",
        "(line 164,col 9)-(line 164,col 57)",
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
        "(line 191,col 9)-(line 191,col 61)",
        "(line 192,col 9)-(line 192,col 111)",
        "(line 193,col 9)-(line 193,col 37)",
        "(line 195,col 9)-(line 195,col 54)",
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
        "(line 204,col 9)-(line 204,col 126)",
        "(line 205,col 9)-(line 205,col 124)",
        "(line 206,col 9)-(line 206,col 124)",
        "(line 207,col 9)-(line 207,col 122)",
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
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 98)",
        "(line 257,col 9)-(line 266,col 11)",
        "(line 268,col 9)-(line 268,col 104)",
        "(line 270,col 9)-(line 270,col 78)",
        "(line 271,col 9)-(line 271,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " because SimpleDateFormat is serializable"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.Anonymous-70da3d39-a24c-4e5f-a495-c5cf99cca496.parseObject(java.lang.String)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 262,col 29)-(line 264,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NTHREADS"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NROUNDS"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.measureTime(java.text.Format, java.text.Format)",
      "begin_line": 277,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 76)",
        "(line 279,col 9)-(line 279,col 59)",
        "(line 280,col 9)-(line 280,col 57)",
        "(line 282,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 24)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 40)",
        "(line 310,col 9)-(line 310,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormatTest.Anonymous-05dd5fc3-3370-49d1-af16-40ed22b96131.run()",
      "begin_line": 284,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 286,col 21)-(line 300,col 21)"
      ]
    }
  ]
}