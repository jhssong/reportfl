{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/LocaleUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 488,
      "comment": "\n * Unit tests for {@link LocaleUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US_ZZZZ"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR_CA"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ_ZZ"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.LocaleUtilsTest(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor.\n     * \n     * @param name\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.setUp()",
      "begin_line": 57,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)",
        "(line 62,col 9)-(line 62,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testConstructor()",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\n     * Test that constructors are public, and work, etc.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 41)",
        "(line 71,col 9)-(line 71,col 76)",
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 73,col 70)",
        "(line 74,col 9)-(line 74,col 80)",
        "(line 75,col 9)-(line 75,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param language  the language string\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 55)",
        "(line 86,col 9)-(line 86,col 46)",
        "(line 87,col 9)-(line 87,col 53)",
        "(line 89,col 9)-(line 89,col 85)",
        "(line 90,col 9)-(line 90,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 100,
      "end_line": 107,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 59)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 103,col 53)",
        "(line 104,col 9)-(line 104,col 51)",
        "(line 106,col 9)-(line 106,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 117,
      "end_line": 126,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     * @param variant of the resulting Locale\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 59)",
        "(line 121,col 9)-(line 121,col 46)",
        "(line 122,col 9)-(line 122,col 53)",
        "(line 123,col 9)-(line 123,col 51)",
        "(line 124,col 9)-(line 124,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_1Part()",
      "begin_line": 131,
      "end_line": 172,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 64)",
        "(line 134,col 9)-(line 134,col 34)",
        "(line 135,col 9)-(line 135,col 34)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 141,col 9)-(line 144,col 49)",
        "(line 145,col 9)-(line 148,col 49)",
        "(line 149,col 9)-(line 152,col 49)",
        "(line 153,col 9)-(line 156,col 49)",
        "(line 158,col 9)-(line 161,col 49)",
        "(line 163,col 9)-(line 166,col 49)",
        "(line 168,col 9)-(line 171,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_2Part()",
      "begin_line": 177,
      "end_line": 206,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 49)",
        "(line 180,col 9)-(line 180,col 49)",
        "(line 182,col 9)-(line 185,col 49)",
        "(line 186,col 9)-(line 189,col 49)",
        "(line 190,col 9)-(line 193,col 49)",
        "(line 194,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 201,col 49)",
        "(line 202,col 9)-(line 205,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_3Part()",
      "begin_line": 211,
      "end_line": 231,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 56)",
        "(line 215,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 226,col 49)",
        "(line 227,col 9)-(line 230,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertLocaleLookupList(java.util.Locale, java.util.Locale, java.util.Locale[])",
      "begin_line": 241,
      "end_line": 249,
      "comment": "\n     * Helper method for local lookups.\n     *\n     * @param locale  the input locale\n     * @param defaultLocale  the input default locale\n     * @param expected  expected results\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 68)",
        "(line 246,col 9)-(line 246,col 57)",
        "(line 247,col 9)-(line 247,col 58)",
        "(line 248,col 9)-(line 248,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_Locale()",
      "begin_line": 255,
      "end_line": 269,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 58)",
        "(line 257,col 9)-(line 257,col 73)",
        "(line 258,col 9)-(line 258,col 73)",
        "(line 259,col 9)-(line 259,col 73)",
        "(line 260,col 9)-(line 263,col 28)",
        "(line 264,col 9)-(line 268,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_LocaleLocale()",
      "begin_line": 274,
      "end_line": 322,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 276,col 41)",
        "(line 277,col 9)-(line 278,col 41)",
        "(line 280,col 9)-(line 283,col 28)",
        "(line 284,col 9)-(line 288,col 28)",
        "(line 289,col 9)-(line 293,col 31)",
        "(line 295,col 9)-(line 299,col 28)",
        "(line 300,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 310,col 28)",
        "(line 311,col 9)-(line 316,col 31)",
        "(line 317,col 9)-(line 321,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleList()",
      "begin_line": 328,
      "end_line": 338,
      "comment": "\n     * Test availableLocaleList() method.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 62)",
        "(line 330,col 9)-(line 330,col 63)",
        "(line 331,col 9)-(line 331,col 28)",
        "(line 332,col 9)-(line 332,col 32)",
        "(line 333,col 9)-(line 333,col 43)",
        "(line 335,col 9)-(line 335,col 63)",
        "(line 336,col 9)-(line 336,col 67)",
        "(line 337,col 9)-(line 337,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleSet()",
      "begin_line": 344,
      "end_line": 355,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 59)",
        "(line 346,col 9)-(line 346,col 60)",
        "(line 347,col 9)-(line 347,col 27)",
        "(line 348,col 9)-(line 348,col 30)",
        "(line 349,col 9)-(line 349,col 42)",
        "(line 351,col 9)-(line 351,col 63)",
        "(line 352,col 9)-(line 352,col 67)",
        "(line 353,col 9)-(line 353,col 70)",
        "(line 354,col 9)-(line 354,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testIsAvailableLocale()",
      "begin_line": 361,
      "end_line": 370,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 59)",
        "(line 363,col 9)-(line 363,col 88)",
        "(line 364,col 9)-(line 364,col 94)",
        "(line 365,col 9)-(line 365,col 104)",
        "(line 366,col 9)-(line 366,col 88)",
        "(line 367,col 9)-(line 367,col 94)",
        "(line 368,col 9)-(line 368,col 88)",
        "(line 369,col 9)-(line 369,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertLanguageByCountry(java.lang.String, java.lang.String[])",
      "begin_line": 382,
      "end_line": 409,
      "comment": "\n     * Make sure the language by country is correct. It checks that \n     * the LocaleUtils.languagesByCountry(country) call contains the \n     * array of languages passed in. It may contain more due to JVM \n     * variations.\n     *\n     * @param country\n     * @param languages array of languages that should be returned\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 68)",
        "(line 384,col 9)-(line 384,col 69)",
        "(line 385,col 9)-(line 385,col 28)",
        "(line 386,col 9)-(line 386,col 32)",
        "(line 388,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLanguagesByCountry()",
      "begin_line": 414,
      "end_line": 419,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 53)",
        "(line 416,col 9)-(line 416,col 58)",
        "(line 417,col 9)-(line 417,col 53)",
        "(line 418,col 9)-(line 418,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertCountriesByLanguage(java.lang.String, java.lang.String[])",
      "begin_line": 432,
      "end_line": 459,
      "comment": "\n     * Make sure the country by language is correct. It checks that \n     * the LocaleUtils.countryByLanguage(language) call contains the \n     * array of countries passed in. It may contain more due to JVM \n     * variations.\n     *\n     *\n     * @param language\n     * @param countries array of countries that should be returned\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 70)",
        "(line 434,col 9)-(line 434,col 71)",
        "(line 435,col 9)-(line 435,col 28)",
        "(line 436,col 9)-(line 436,col 32)",
        "(line 438,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testCountriesByLanguage()",
      "begin_line": 464,
      "end_line": 469,
      "comment": "\n     * Test countriesByLanguage() method.\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 55)",
        "(line 466,col 9)-(line 466,col 78)",
        "(line 467,col 9)-(line 467,col 55)",
        "(line 468,col 9)-(line 468,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertUnmodifiableCollection(java.util.Collection\u003c?\u003e)",
      "begin_line": 474,
      "end_line": 479,
      "comment": "\n     * @param coll  the collection to check\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 478,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLang328()",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Tests #LANG-328 - only language+variant\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 60)"
      ]
    }
  ]
}