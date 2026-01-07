{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/LocaleUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 498,
      "comment": "\n * Unit tests for {@link LocaleUtils}.\n *\n * @author Chris Hyzer\n * @author Stephen Colebourne\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US_ZZZZ"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR_CA"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ_ZZ"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.LocaleUtilsTest(java.lang.String)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Constructor.\n     * \n     * @param name\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.main(java.lang.String[])",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Main.\n     * @param args\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.suite()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Run the test cases as a suite.\n     * @return the Test\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 63)",
        "(line 74,col 9)-(line 74,col 47)",
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.setUp()",
      "begin_line": 78,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)",
        "(line 82,col 9)-(line 82,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testConstructor()",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * Test that constructors are public, and work, etc.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 41)",
        "(line 91,col 9)-(line 91,col 73)",
        "(line 92,col 9)-(line 92,col 37)",
        "(line 93,col 9)-(line 93,col 70)",
        "(line 94,col 9)-(line 94,col 80)",
        "(line 95,col 9)-(line 95,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param language  the language string\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 55)",
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 109,col 9)-(line 109,col 85)",
        "(line 110,col 9)-(line 110,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 59)",
        "(line 122,col 9)-(line 122,col 46)",
        "(line 123,col 9)-(line 123,col 53)",
        "(line 124,col 9)-(line 124,col 51)",
        "(line 126,col 9)-(line 126,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 137,
      "end_line": 146,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     * @param variant of the resulting Locale\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 59)",
        "(line 141,col 9)-(line 141,col 46)",
        "(line 142,col 9)-(line 142,col 53)",
        "(line 143,col 9)-(line 143,col 51)",
        "(line 144,col 9)-(line 144,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_1Part()",
      "begin_line": 151,
      "end_line": 192,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 64)",
        "(line 154,col 9)-(line 154,col 34)",
        "(line 155,col 9)-(line 155,col 34)",
        "(line 156,col 9)-(line 156,col 34)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 159,col 9)-(line 159,col 34)",
        "(line 161,col 9)-(line 164,col 49)",
        "(line 165,col 9)-(line 168,col 49)",
        "(line 169,col 9)-(line 172,col 49)",
        "(line 173,col 9)-(line 176,col 49)",
        "(line 178,col 9)-(line 181,col 49)",
        "(line 183,col 9)-(line 186,col 49)",
        "(line 188,col 9)-(line 191,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_2Part()",
      "begin_line": 197,
      "end_line": 226,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 49)",
        "(line 200,col 9)-(line 200,col 49)",
        "(line 202,col 9)-(line 205,col 49)",
        "(line 206,col 9)-(line 209,col 49)",
        "(line 210,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 217,col 49)",
        "(line 218,col 9)-(line 221,col 49)",
        "(line 222,col 9)-(line 225,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_3Part()",
      "begin_line": 231,
      "end_line": 251,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 56)",
        "(line 235,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 246,col 49)",
        "(line 247,col 9)-(line 250,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertLocaleLookupList(java.util.Locale, java.util.Locale, java.util.Locale[])",
      "begin_line": 261,
      "end_line": 269,
      "comment": "\n     * Helper method for local lookups.\n     *\n     * @param locale  the input locale\n     * @param defaultLocale  the input default locale\n     * @param expected  expected results\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 68)",
        "(line 266,col 9)-(line 266,col 57)",
        "(line 267,col 9)-(line 267,col 58)",
        "(line 268,col 9)-(line 268,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLocaleLookupList_Locale()",
      "begin_line": 275,
      "end_line": 289,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 58)",
        "(line 277,col 9)-(line 277,col 73)",
        "(line 278,col 9)-(line 278,col 73)",
        "(line 279,col 9)-(line 279,col 73)",
        "(line 280,col 9)-(line 283,col 28)",
        "(line 284,col 9)-(line 288,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLocaleLookupList_LocaleLocale()",
      "begin_line": 294,
      "end_line": 342,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 296,col 41)",
        "(line 297,col 9)-(line 298,col 41)",
        "(line 300,col 9)-(line 303,col 28)",
        "(line 304,col 9)-(line 308,col 28)",
        "(line 309,col 9)-(line 313,col 31)",
        "(line 315,col 9)-(line 319,col 28)",
        "(line 320,col 9)-(line 324,col 28)",
        "(line 325,col 9)-(line 330,col 28)",
        "(line 331,col 9)-(line 336,col 31)",
        "(line 337,col 9)-(line 341,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testAvailableLocaleList()",
      "begin_line": 348,
      "end_line": 358,
      "comment": "\n     * Test availableLocaleList() method.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 54)",
        "(line 350,col 9)-(line 350,col 55)",
        "(line 351,col 9)-(line 351,col 28)",
        "(line 352,col 9)-(line 352,col 32)",
        "(line 353,col 9)-(line 353,col 43)",
        "(line 355,col 9)-(line 355,col 63)",
        "(line 356,col 9)-(line 356,col 59)",
        "(line 357,col 9)-(line 357,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testAvailableLocaleSet()",
      "begin_line": 364,
      "end_line": 375,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 51)",
        "(line 366,col 9)-(line 366,col 52)",
        "(line 367,col 9)-(line 367,col 27)",
        "(line 368,col 9)-(line 368,col 30)",
        "(line 369,col 9)-(line 369,col 42)",
        "(line 371,col 9)-(line 371,col 63)",
        "(line 372,col 9)-(line 372,col 59)",
        "(line 373,col 9)-(line 373,col 54)",
        "(line 374,col 9)-(line 374,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testIsAvailableLocale()",
      "begin_line": 381,
      "end_line": 390,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 51)",
        "(line 383,col 9)-(line 383,col 88)",
        "(line 384,col 9)-(line 384,col 94)",
        "(line 385,col 9)-(line 385,col 104)",
        "(line 386,col 9)-(line 386,col 88)",
        "(line 387,col 9)-(line 387,col 94)",
        "(line 388,col 9)-(line 388,col 88)",
        "(line 389,col 9)-(line 389,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertLanguageByCountry(java.lang.String, java.lang.String[])",
      "begin_line": 399,
      "end_line": 427,
      "comment": "\n     * Make sure the language by country is correct.\n     *\n     * @param country\n     * @param languages array of languages that should be returned\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 60)",
        "(line 401,col 9)-(line 401,col 61)",
        "(line 402,col 9)-(line 402,col 28)",
        "(line 403,col 9)-(line 403,col 32)",
        "(line 404,col 9)-(line 404,col 52)",
        "(line 406,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLanguagesByCountry()",
      "begin_line": 432,
      "end_line": 437,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 53)",
        "(line 434,col 9)-(line 434,col 58)",
        "(line 435,col 9)-(line 435,col 53)",
        "(line 436,col 9)-(line 436,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertCountriesByLanguage(java.lang.String, java.lang.String[])",
      "begin_line": 446,
      "end_line": 474,
      "comment": "\n     * Make sure the language by country is correct.\n     *\n     * @param language\n     * @param countries array of countries that should be returned\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 62)",
        "(line 448,col 9)-(line 448,col 63)",
        "(line 449,col 9)-(line 449,col 28)",
        "(line 450,col 9)-(line 450,col 32)",
        "(line 451,col 9)-(line 451,col 52)",
        "(line 453,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testCountriesByLanguage()",
      "begin_line": 479,
      "end_line": 479,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertUnmodifiableCollection(java.util.Collection)",
      "begin_line": 491,
      "end_line": 496,
      "comment": "\n     * @param coll  the collection to check\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 495,col 53)"
      ]
    }
  ]
}