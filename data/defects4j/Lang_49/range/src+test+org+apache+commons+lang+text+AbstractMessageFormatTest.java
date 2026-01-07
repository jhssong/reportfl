{
  "filepath": "/tmp/Lang-49b/src/test/org/apache/commons/lang/text/AbstractMessageFormatTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMessageFormatTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 294,
      "comment": "\n * Abstract testcase to verify behavior of default-configuration\n * ExtendedMessageFormat vs. MessageFormat.\n * \n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBERS"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DATES"
      ],
      "begin_line": 46,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.setUp()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.createMessageFormat(java.lang.String, java.util.Locale)",
      "begin_line": 70,
      "end_line": 71,
      "comment": "\n     * Create a MessageFormat.\n     * @param pattern\n     * @param locale\n     * @return\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.getLocale()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Get the Locale to use.\n     * @return\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.lang.String, java.lang.String, java.lang.Object[], java.lang.String)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 63)",
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 87,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.text.Format, java.lang.Object[])",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.text.Format, java.lang.Object[], java.lang.String)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.doAssertions(java.text.Format, java.lang.Object[], java.lang.String, java.lang.String)",
      "begin_line": 98,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 50)",
        "(line 101,col 9)-(line 101,col 51)",
        "(line 102,col 9)-(line 102,col 56)",
        "(line 103,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 125,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNoFormatElements()",
      "begin_line": 128,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 50)",
        "(line 130,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 137,col 9)-(line 137,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testSimpleStrings()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testSimpleNumbers()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testSimpleDates()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 150,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNumber()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNumberLooseFormatting()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 159,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testInteger()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 164,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testIntegerLooseFormatting()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 169,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testCurrency()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 174,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testPercent()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 179,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testNumberPattern()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 184,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testDate()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 189,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testDateLooseFormatting()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 194,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testShortDate()",
      "begin_line": 197,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 82)",
        "(line 199,col 9)-(line 199,col 86)",
        "(line 200,col 9)-(line 201,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testShortDateLooseFormatting()",
      "begin_line": 204,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 82)",
        "(line 206,col 9)-(line 206,col 86)",
        "(line 207,col 9)-(line 208,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testMediumDate()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 213,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testLongDate()",
      "begin_line": 216,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 80)",
        "(line 218,col 9)-(line 219,col 24)",
        "(line 220,col 9)-(line 221,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testFullDate()",
      "begin_line": 224,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 80)",
        "(line 226,col 9)-(line 226,col 80)",
        "(line 227,col 9)-(line 228,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testDatePattern()",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 233,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testTime()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 238,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testShortTime()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 243,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testMediumTime()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 248,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testLongTime()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 253,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testFullTime()",
      "begin_line": 256,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 80)",
        "(line 258,col 9)-(line 258,col 80)",
        "(line 259,col 9)-(line 260,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testTimePattern()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testChoice()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 269,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testChoiceLooseFormatting()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 274,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.AbstractMessageFormatTest.testChoiceRecursive()",
      "begin_line": 277,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 59)",
        "(line 279,col 9)-(line 279,col 49)",
        "(line 280,col 9)-(line 280,col 58)",
        "(line 281,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 292,col 29)"
      ]
    }
  ]
}