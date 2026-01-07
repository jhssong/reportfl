{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/LocaleUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 509,
      "comment": "\n * Unit tests for {@link LocaleUtils}.\n *\n * @author Apache Software Foundation\n * @author Chris Hyzer\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.LocaleUtilsTest(java.lang.String)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Constructor.\n     * \n     * @param name\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.main(java.lang.String[])",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Main.\n     * @param args\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.suite()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Run the test cases as a suite.\n     * @return the Test\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 63)",
        "(line 74,col 9)-(line 74,col 43)",
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.setUp()",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 22)",
        "(line 83,col 9)-(line 83,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testConstructor()",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * Test that constructors are public, and work, etc.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)",
        "(line 92,col 9)-(line 92,col 76)",
        "(line 93,col 9)-(line 93,col 37)",
        "(line 94,col 9)-(line 94,col 70)",
        "(line 95,col 9)-(line 95,col 80)",
        "(line 96,col 9)-(line 96,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param language  the language string\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 55)",
        "(line 107,col 9)-(line 107,col 46)",
        "(line 108,col 9)-(line 108,col 53)",
        "(line 110,col 9)-(line 110,col 85)",
        "(line 111,col 9)-(line 111,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 121,
      "end_line": 128,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 59)",
        "(line 123,col 9)-(line 123,col 46)",
        "(line 124,col 9)-(line 124,col 53)",
        "(line 125,col 9)-(line 125,col 51)",
        "(line 127,col 9)-(line 127,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 138,
      "end_line": 147,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     * @param variant of the resulting Locale\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 59)",
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 144,col 9)-(line 144,col 51)",
        "(line 145,col 9)-(line 145,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_1Part()",
      "begin_line": 152,
      "end_line": 193,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 64)",
        "(line 155,col 9)-(line 155,col 34)",
        "(line 156,col 9)-(line 156,col 34)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 158,col 34)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 162,col 9)-(line 165,col 49)",
        "(line 166,col 9)-(line 169,col 49)",
        "(line 170,col 9)-(line 173,col 49)",
        "(line 174,col 9)-(line 177,col 49)",
        "(line 179,col 9)-(line 182,col 49)",
        "(line 184,col 9)-(line 187,col 49)",
        "(line 189,col 9)-(line 192,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_2Part()",
      "begin_line": 198,
      "end_line": 227,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 49)",
        "(line 201,col 9)-(line 201,col 49)",
        "(line 203,col 9)-(line 206,col 49)",
        "(line 207,col 9)-(line 210,col 49)",
        "(line 211,col 9)-(line 214,col 49)",
        "(line 215,col 9)-(line 218,col 49)",
        "(line 219,col 9)-(line 222,col 49)",
        "(line 223,col 9)-(line 226,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_3Part()",
      "begin_line": 232,
      "end_line": 252,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 56)",
        "(line 236,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 247,col 49)",
        "(line 248,col 9)-(line 251,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertLocaleLookupList(java.util.Locale, java.util.Locale, java.util.Locale[])",
      "begin_line": 262,
      "end_line": 270,
      "comment": "\n     * Helper method for local lookups.\n     *\n     * @param locale  the input locale\n     * @param defaultLocale  the input default locale\n     * @param expected  expected results\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 68)",
        "(line 267,col 9)-(line 267,col 57)",
        "(line 268,col 9)-(line 268,col 58)",
        "(line 269,col 9)-(line 269,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_Locale()",
      "begin_line": 276,
      "end_line": 290,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 58)",
        "(line 278,col 9)-(line 278,col 73)",
        "(line 279,col 9)-(line 279,col 73)",
        "(line 280,col 9)-(line 280,col 73)",
        "(line 281,col 9)-(line 284,col 28)",
        "(line 285,col 9)-(line 289,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_LocaleLocale()",
      "begin_line": 295,
      "end_line": 343,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 297,col 41)",
        "(line 298,col 9)-(line 299,col 41)",
        "(line 301,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 309,col 28)",
        "(line 310,col 9)-(line 314,col 31)",
        "(line 316,col 9)-(line 320,col 28)",
        "(line 321,col 9)-(line 325,col 28)",
        "(line 326,col 9)-(line 331,col 28)",
        "(line 332,col 9)-(line 337,col 31)",
        "(line 338,col 9)-(line 342,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleList()",
      "begin_line": 349,
      "end_line": 359,
      "comment": "\n     * Test availableLocaleList() method.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 62)",
        "(line 351,col 9)-(line 351,col 63)",
        "(line 352,col 9)-(line 352,col 28)",
        "(line 353,col 9)-(line 353,col 32)",
        "(line 354,col 9)-(line 354,col 43)",
        "(line 356,col 9)-(line 356,col 63)",
        "(line 357,col 9)-(line 357,col 67)",
        "(line 358,col 9)-(line 358,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleSet()",
      "begin_line": 365,
      "end_line": 376,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 59)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 368,col 27)",
        "(line 369,col 9)-(line 369,col 30)",
        "(line 370,col 9)-(line 370,col 42)",
        "(line 372,col 9)-(line 372,col 63)",
        "(line 373,col 9)-(line 373,col 67)",
        "(line 374,col 9)-(line 374,col 70)",
        "(line 375,col 9)-(line 375,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testIsAvailableLocale()",
      "begin_line": 382,
      "end_line": 391,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 59)",
        "(line 384,col 9)-(line 384,col 88)",
        "(line 385,col 9)-(line 385,col 94)",
        "(line 386,col 9)-(line 386,col 104)",
        "(line 387,col 9)-(line 387,col 88)",
        "(line 388,col 9)-(line 388,col 94)",
        "(line 389,col 9)-(line 389,col 88)",
        "(line 390,col 9)-(line 390,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertLanguageByCountry(java.lang.String, java.lang.String[])",
      "begin_line": 403,
      "end_line": 430,
      "comment": "\n     * Make sure the language by country is correct. It checks that \n     * the LocaleUtils.languagesByCountry(country) call contains the \n     * array of languages passed in. It may contain more due to JVM \n     * variations.\n     *\n     * @param country\n     * @param languages array of languages that should be returned\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 68)",
        "(line 405,col 9)-(line 405,col 69)",
        "(line 406,col 9)-(line 406,col 28)",
        "(line 407,col 9)-(line 407,col 32)",
        "(line 409,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLanguagesByCountry()",
      "begin_line": 435,
      "end_line": 440,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 53)",
        "(line 437,col 9)-(line 437,col 58)",
        "(line 438,col 9)-(line 438,col 53)",
        "(line 439,col 9)-(line 439,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertCountriesByLanguage(java.lang.String, java.lang.String[])",
      "begin_line": 453,
      "end_line": 480,
      "comment": "\n     * Make sure the country by language is correct. It checks that \n     * the LocaleUtils.countryByLanguage(language) call contains the \n     * array of countries passed in. It may contain more due to JVM \n     * variations.\n     *\n     *\n     * @param language\n     * @param countries array of countries that should be returned\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 70)",
        "(line 455,col 9)-(line 455,col 71)",
        "(line 456,col 9)-(line 456,col 28)",
        "(line 457,col 9)-(line 457,col 32)",
        "(line 459,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testCountriesByLanguage()",
      "begin_line": 485,
      "end_line": 490,
      "comment": "\n     * Test countriesByLanguage() method.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 55)",
        "(line 487,col 9)-(line 487,col 78)",
        "(line 488,col 9)-(line 488,col 55)",
        "(line 489,col 9)-(line 489,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertUnmodifiableCollection(java.util.Collection\u003c?\u003e)",
      "begin_line": 495,
      "end_line": 500,
      "comment": "\n     * @param coll  the collection to check\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 499,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLang328()",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * Tests #LANG-328 - only language+variant\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 60)"
      ]
    }
  ]
}