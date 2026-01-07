{
  "filepath": "/tmp/Lang-1b/src/test/java/org/apache/commons/lang3/LocaleUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 585,
      "comment": "\n * Unit tests for {@link LocaleUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US_ZZZZ"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR_CA"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ_ZZ"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.setUp()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testConstructor()",
      "begin_line": 67,
      "end_line": 75,
      "comment": "\n     * Test that constructors are public, and work, etc.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 41)",
        "(line 70,col 9)-(line 70,col 82)",
        "(line 71,col 9)-(line 71,col 37)",
        "(line 72,col 9)-(line 72,col 62)",
        "(line 73,col 9)-(line 73,col 72)",
        "(line 74,col 9)-(line 74,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String)",
      "begin_line": 83,
      "end_line": 90,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param language  the language string\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 61)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 86,col 53)",
        "(line 88,col 9)-(line 88,col 81)",
        "(line 89,col 9)-(line 89,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 99,
      "end_line": 106,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 65)",
        "(line 101,col 9)-(line 101,col 46)",
        "(line 102,col 9)-(line 102,col 53)",
        "(line 103,col 9)-(line 103,col 51)",
        "(line 105,col 9)-(line 105,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 116,
      "end_line": 125,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     * @param variant of the resulting Locale\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 65)",
        "(line 120,col 9)-(line 120,col 46)",
        "(line 121,col 9)-(line 121,col 53)",
        "(line 122,col 9)-(line 122,col 51)",
        "(line 123,col 9)-(line 123,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_1Part()",
      "begin_line": 130,
      "end_line": 172,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 64)",
        "(line 134,col 9)-(line 134,col 34)",
        "(line 135,col 9)-(line 135,col 34)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 141,col 9)-(line 144,col 55)",
        "(line 145,col 9)-(line 148,col 55)",
        "(line 149,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 156,col 55)",
        "(line 158,col 9)-(line 161,col 55)",
        "(line 163,col 9)-(line 166,col 55)",
        "(line 168,col 9)-(line 171,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_2Part()",
      "begin_line": 177,
      "end_line": 207,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 49)",
        "(line 181,col 9)-(line 181,col 49)",
        "(line 183,col 9)-(line 186,col 55)",
        "(line 187,col 9)-(line 190,col 55)",
        "(line 191,col 9)-(line 194,col 55)",
        "(line 195,col 9)-(line 198,col 55)",
        "(line 199,col 9)-(line 202,col 55)",
        "(line 203,col 9)-(line 206,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_3Part()",
      "begin_line": 212,
      "end_line": 233,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 56)",
        "(line 217,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 228,col 55)",
        "(line 229,col 9)-(line 232,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertLocaleLookupList(java.util.Locale, java.util.Locale, java.util.Locale[])",
      "begin_line": 243,
      "end_line": 251,
      "comment": "\n     * Helper method for local lookups.\n     *\n     * @param locale  the input locale\n     * @param defaultLocale  the input default locale\n     * @param expected  expected results\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 68)",
        "(line 248,col 9)-(line 248,col 57)",
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 250,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_Locale()",
      "begin_line": 257,
      "end_line": 272,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 58)",
        "(line 260,col 9)-(line 260,col 73)",
        "(line 261,col 9)-(line 261,col 73)",
        "(line 262,col 9)-(line 262,col 73)",
        "(line 263,col 9)-(line 266,col 28)",
        "(line 267,col 9)-(line 271,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_LocaleLocale()",
      "begin_line": 277,
      "end_line": 326,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 280,col 41)",
        "(line 281,col 9)-(line 282,col 41)",
        "(line 284,col 9)-(line 287,col 28)",
        "(line 288,col 9)-(line 292,col 28)",
        "(line 293,col 9)-(line 297,col 31)",
        "(line 299,col 9)-(line 303,col 28)",
        "(line 304,col 9)-(line 308,col 28)",
        "(line 309,col 9)-(line 314,col 28)",
        "(line 315,col 9)-(line 320,col 31)",
        "(line 321,col 9)-(line 325,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleList()",
      "begin_line": 332,
      "end_line": 343,
      "comment": "\n     * Test availableLocaleList() method.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 68)",
        "(line 335,col 9)-(line 335,col 69)",
        "(line 336,col 9)-(line 336,col 28)",
        "(line 337,col 9)-(line 337,col 32)",
        "(line 338,col 9)-(line 338,col 43)",
        "(line 340,col 9)-(line 340,col 69)",
        "(line 341,col 9)-(line 341,col 73)",
        "(line 342,col 9)-(line 342,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleSet()",
      "begin_line": 349,
      "end_line": 361,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 65)",
        "(line 352,col 9)-(line 352,col 66)",
        "(line 353,col 9)-(line 353,col 27)",
        "(line 354,col 9)-(line 354,col 30)",
        "(line 355,col 9)-(line 355,col 42)",
        "(line 357,col 9)-(line 357,col 69)",
        "(line 358,col 9)-(line 358,col 73)",
        "(line 359,col 9)-(line 359,col 76)",
        "(line 360,col 9)-(line 360,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testIsAvailableLocale()",
      "begin_line": 367,
      "end_line": 378,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 65)",
        "(line 371,col 9)-(line 371,col 88)",
        "(line 372,col 9)-(line 372,col 94)",
        "(line 373,col 9)-(line 373,col 104)",
        "(line 374,col 9)-(line 374,col 88)",
        "(line 375,col 9)-(line 375,col 94)",
        "(line 376,col 9)-(line 376,col 88)",
        "(line 377,col 9)-(line 377,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertLanguageByCountry(java.lang.String, java.lang.String[])",
      "begin_line": 390,
      "end_line": 417,
      "comment": "\n     * Make sure the language by country is correct. It checks that \n     * the LocaleUtils.languagesByCountry(country) call contains the \n     * array of languages passed in. It may contain more due to JVM \n     * variations.\n     *\n     * @param country\n     * @param languages array of languages that should be returned\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 74)",
        "(line 392,col 9)-(line 392,col 75)",
        "(line 393,col 9)-(line 393,col 28)",
        "(line 394,col 9)-(line 394,col 32)",
        "(line 396,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLanguagesByCountry()",
      "begin_line": 422,
      "end_line": 428,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 53)",
        "(line 425,col 9)-(line 425,col 58)",
        "(line 426,col 9)-(line 426,col 53)",
        "(line 427,col 9)-(line 427,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertCountriesByLanguage(java.lang.String, java.lang.String[])",
      "begin_line": 441,
      "end_line": 468,
      "comment": "\n     * Make sure the country by language is correct. It checks that \n     * the LocaleUtils.countryByLanguage(language) call contains the \n     * array of countries passed in. It may contain more due to JVM \n     * variations.\n     *\n     *\n     * @param language\n     * @param countries array of countries that should be returned\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 76)",
        "(line 443,col 9)-(line 443,col 77)",
        "(line 444,col 9)-(line 444,col 28)",
        "(line 445,col 9)-(line 445,col 32)",
        "(line 447,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testCountriesByLanguage()",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\n     * Test countriesByLanguage() method.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 55)",
        "(line 476,col 9)-(line 476,col 78)",
        "(line 477,col 9)-(line 477,col 55)",
        "(line 478,col 9)-(line 478,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertUnmodifiableCollection(java.util.Collection\u003c?\u003e)",
      "begin_line": 484,
      "end_line": 489,
      "comment": "\n     * @param coll  the collection to check\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 488,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLang328()",
      "begin_line": 494,
      "end_line": 498,
      "comment": "\n     * Tests #LANG-328 - only language+variant\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 52)",
        "(line 497,col 9)-(line 497,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLang865()",
      "begin_line": 503,
      "end_line": 543,
      "comment": "\n     * Tests #LANG-865, strings starting with an underscore.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 49)",
        "(line 506,col 9)-(line 506,col 52)",
        "(line 507,col 9)-(line 507,col 60)",
        "(line 508,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testParseAllLocales()",
      "begin_line": 545,
      "end_line": 546,
      "comment": "",
      "child_ranges": []
    }
  ]
}