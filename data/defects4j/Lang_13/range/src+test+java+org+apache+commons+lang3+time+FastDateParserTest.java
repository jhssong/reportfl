{
  "filepath": "/tmp/Lang-13b/src/test/java/org/apache/commons/lang3/time/FastDateParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 367,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.FastDateParser}.\n *\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "yMdHmsSZ"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DMY_DOT"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "YMD_SLASH"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MDY_DASH"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MDY_SLASH"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REYKJAVIK"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NEW_YORK"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SWEDEN"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.getInstance(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.getDateInstance(int, java.util.Locale)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Override this method in derived tests to change the construction of instances\n     * @param format\n     * @param timeZone\n     * @param locale\n     * @return\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.test_Equality_Hash()",
      "begin_line": 79,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 89,col 10)",
        "(line 91,col 9)-(line 91,col 71)",
        "(line 92,col 9)-(line 92,col 17)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 97,col 13)",
        "(line 98,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testParseZone()",
      "begin_line": 103,
      "end_line": 104,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testParseLongShort()",
      "begin_line": 130,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 64)",
        "(line 133,col 9)-(line 133,col 20)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 135,col 43)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 138,col 9)-(line 138,col 116)",
        "(line 140,col 9)-(line 140,col 112)",
        "(line 141,col 9)-(line 141,col 52)",
        "(line 143,col 9)-(line 143,col 98)",
        "(line 144,col 17)-(line 144,col 51)",
        "(line 146,col 9)-(line 146,col 72)",
        "(line 147,col 9)-(line 147,col 87)",
        "(line 149,col 9)-(line 149,col 52)",
        "(line 150,col 9)-(line 150,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testAmPm()",
      "begin_line": 153,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 64)",
        "(line 156,col 9)-(line 156,col 20)",
        "(line 158,col 9)-(line 158,col 81)",
        "(line 159,col 9)-(line 159,col 81)",
        "(line 160,col 9)-(line 160,col 79)",
        "(line 161,col 9)-(line 161,col 79)",
        "(line 163,col 9)-(line 163,col 39)",
        "(line 164,col 9)-(line 164,col 71)",
        "(line 165,col 9)-(line 165,col 70)",
        "(line 166,col 9)-(line 166,col 68)",
        "(line 167,col 9)-(line 167,col 68)",
        "(line 169,col 9)-(line 169,col 39)",
        "(line 170,col 9)-(line 170,col 70)",
        "(line 171,col 9)-(line 171,col 70)",
        "(line 172,col 9)-(line 172,col 68)",
        "(line 173,col 9)-(line 173,col 68)",
        "(line 175,col 9)-(line 175,col 40)",
        "(line 176,col 9)-(line 176,col 70)",
        "(line 177,col 9)-(line 177,col 70)",
        "(line 178,col 9)-(line 178,col 68)",
        "(line 179,col 9)-(line 179,col 68)",
        "(line 181,col 9)-(line 181,col 40)",
        "(line 182,col 9)-(line 182,col 71)",
        "(line 183,col 9)-(line 183,col 70)",
        "(line 184,col 9)-(line 184,col 68)",
        "(line 185,col 9)-(line 185,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testLocales()",
      "begin_line": 188,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.checkParse(java.util.Calendar, java.text.SimpleDateFormat, org.apache.commons.lang3.time.DateParser)",
      "begin_line": 221,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 56)",
        "(line 223,col 9)-(line 223,col 53)",
        "(line 224,col 9)-(line 224,col 51)",
        "(line 225,col 9)-(line 225,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testParseNumerics()",
      "begin_line": 228,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 64)",
        "(line 231,col 9)-(line 231,col 20)",
        "(line 232,col 9)-(line 232,col 41)",
        "(line 233,col 9)-(line 233,col 43)",
        "(line 235,col 9)-(line 235,col 79)",
        "(line 236,col 9)-(line 236,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testQuotes()",
      "begin_line": 239,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 64)",
        "(line 242,col 9)-(line 242,col 20)",
        "(line 243,col 9)-(line 243,col 41)",
        "(line 244,col 9)-(line 244,col 43)",
        "(line 246,col 9)-(line 246,col 89)",
        "(line 247,col 9)-(line 247,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testDayOf()",
      "begin_line": 250,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 64)",
        "(line 253,col 9)-(line 253,col 20)",
        "(line 254,col 9)-(line 254,col 29)",
        "(line 256,col 9)-(line 256,col 71)",
        "(line 257,col 9)-(line 257,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testShortDateStyleWithLocales()",
      "begin_line": 264,
      "end_line": 275,
      "comment": "\n     * Test case for {@link FastDateParser#getDateInstance(int, java.util.Locale)}.\n     * @throws ParseException \n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 74)",
        "(line 267,col 9)-(line 267,col 46)",
        "(line 268,col 9)-(line 268,col 20)",
        "(line 270,col 9)-(line 270,col 28)",
        "(line 271,col 9)-(line 271,col 57)",
        "(line 273,col 9)-(line 273,col 60)",
        "(line 274,col 9)-(line 274,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testLowYearPadding()",
      "begin_line": 281,
      "end_line": 295,
      "comment": "\n     * Tests that pre-1000AD years get padded with yyyy\n     * @throws ParseException \n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 51)",
        "(line 284,col 9)-(line 284,col 46)",
        "(line 285,col 9)-(line 285,col 20)",
        "(line 287,col 9)-(line 287,col 23)",
        "(line 288,col 9)-(line 288,col 64)",
        "(line 289,col 9)-(line 289,col 24)",
        "(line 290,col 9)-(line 290,col 64)",
        "(line 291,col 9)-(line 291,col 25)",
        "(line 292,col 9)-(line 292,col 64)",
        "(line 293,col 9)-(line 293,col 25)",
        "(line 294,col 9)-(line 294,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testMilleniumBug()",
      "begin_line": 300,
      "end_line": 308,
      "comment": "\n     * @throws ParseException \n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 49)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 304,col 20)",
        "(line 306,col 9)-(line 306,col 26)",
        "(line 307,col 9)-(line 307,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testLang303()",
      "begin_line": 310,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 51)",
        "(line 313,col 9)-(line 313,col 46)",
        "(line 314,col 9)-(line 314,col 28)",
        "(line 316,col 9)-(line 316,col 47)",
        "(line 318,col 9)-(line 318,col 117)",
        "(line 319,col 9)-(line 319,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testLang538()",
      "begin_line": 322,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 101)",
        "(line 326,col 9)-(line 326,col 75)",
        "(line 327,col 9)-(line 327,col 20)",
        "(line 328,col 9)-(line 328,col 40)",
        "(line 330,col 9)-(line 330,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testEquals()",
      "begin_line": 333,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 51)",
        "(line 336,col 9)-(line 336,col 51)",
        "(line 338,col 9)-(line 338,col 39)",
        "(line 339,col 9)-(line 339,col 61)",
        "(line 341,col 9)-(line 341,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testToStringContainsName()",
      "begin_line": 344,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 50)",
        "(line 347,col 9)-(line 347,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testPatternMatches()",
      "begin_line": 350,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 49)",
        "(line 353,col 9)-(line 353,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testLocaleMatches()",
      "begin_line": 356,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 57)",
        "(line 359,col 9)-(line 359,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParserTest.testTimeZoneMatches()",
      "begin_line": 362,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 60)",
        "(line 365,col 9)-(line 365,col 54)"
      ]
    }
  ]
}