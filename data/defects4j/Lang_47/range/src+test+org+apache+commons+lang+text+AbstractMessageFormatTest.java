{
  "filepath": "/tmp/Lang-47b/src/test/org/apache/commons/lang/text/AbstractMessageFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMessageFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 44,
      "end_line": 306,
      "comment": "\n * Abstract testcase to verify behavior of default-configuration\n * ExtendedMessageFormat vs. MessageFormat.\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBERS"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DATES"
      ],
      "begin_line": 48,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.setUp()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 22)",
        "(line 63,col 9)-(line 63,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.createMessageFormat(java.lang.String, java.util.Locale)",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n     * Create a MessageFormat.\n     * @param pattern\n     * @param locale\n     * @return\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.getLocale()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Get the Locale to use.\n     * @return\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.lang.String, java.lang.String, java.lang.Object[], java.lang.String)",
      "begin_line": 85,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 63)",
        "(line 88,col 9)-(line 88,col 47)",
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.text.Format, java.lang.Object[])",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.text.Format, java.lang.Object[], java.lang.String)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.text.Format, java.lang.Object[], java.lang.String, java.lang.String)",
      "begin_line": 102,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 50)",
        "(line 105,col 9)-(line 105,col 51)",
        "(line 106,col 9)-(line 106,col 56)",
        "(line 107,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 129,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNoFormatElements()",
      "begin_line": 132,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 50)",
        "(line 134,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 141,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testSimpleStrings()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testSimpleNumbers()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testSimpleDates()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 154,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNumber()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNumberLooseFormatting()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 163,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testInteger()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testIntegerLooseFormatting()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 173,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testCurrency()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 178,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testPercent()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 183,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNumberPattern()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 188,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testDate()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 193,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testDateLooseFormatting()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 198,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testShortDate()",
      "begin_line": 201,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 82)",
        "(line 203,col 9)-(line 203,col 86)",
        "(line 204,col 9)-(line 205,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testShortDateLooseFormatting()",
      "begin_line": 208,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 82)",
        "(line 210,col 9)-(line 210,col 86)",
        "(line 211,col 9)-(line 212,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testMediumDate()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 217,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testLongDate()",
      "begin_line": 220,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 80)",
        "(line 222,col 9)-(line 223,col 24)",
        "(line 224,col 9)-(line 225,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testFullDate()",
      "begin_line": 228,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 80)",
        "(line 230,col 9)-(line 230,col 80)",
        "(line 231,col 9)-(line 232,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testDatePattern()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 237,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testTime()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 242,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testShortTime()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 247,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testMediumTime()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 252,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testLongTime()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 257,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testFullTime()",
      "begin_line": 260,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 80)",
        "(line 262,col 9)-(line 262,col 80)",
        "(line 263,col 9)-(line 264,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testTimePattern()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testChoice()",
      "begin_line": 271,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 273,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testChoiceLooseFormatting()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testChoiceRecursive()",
      "begin_line": 281,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 59)",
        "(line 283,col 9)-(line 283,col 49)",
        "(line 284,col 9)-(line 284,col 58)",
        "(line 285,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 296,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.getIntegerNumberFormat(java.util.Locale)",
      "begin_line": 299,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 63)",
        "(line 301,col 9)-(line 301,col 43)",
        "(line 302,col 9)-(line 302,col 41)",
        "(line 303,col 9)-(line 303,col 22)"
      ]
    }
  ]
}