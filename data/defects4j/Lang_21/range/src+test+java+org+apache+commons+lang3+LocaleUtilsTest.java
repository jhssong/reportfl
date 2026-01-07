{
  "filepath": "/tmp/Lang-21b/src/test/java/org/apache/commons/lang3/LocaleUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 490,
      "comment": "\n * Unit tests for {@link LocaleUtils}.\n *\n * @author Apache Software Foundation\n * @author Chris Hyzer\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_EN_US_ZZZZ"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_FR_CA"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCALE_QQ_ZZ"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.LocaleUtilsTest(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructor.\n     * \n     * @param name\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.setUp()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)",
        "(line 64,col 9)-(line 64,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testConstructor()",
      "begin_line": 71,
      "end_line": 78,
      "comment": "\n     * Test that constructors are public, and work, etc.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 41)",
        "(line 73,col 9)-(line 73,col 76)",
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 75,col 70)",
        "(line 76,col 9)-(line 76,col 80)",
        "(line 77,col 9)-(line 77,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String)",
      "begin_line": 86,
      "end_line": 93,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param language  the language string\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 88,col 46)",
        "(line 89,col 9)-(line 89,col 53)",
        "(line 91,col 9)-(line 91,col 85)",
        "(line 92,col 9)-(line 92,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 59)",
        "(line 104,col 9)-(line 104,col 46)",
        "(line 105,col 9)-(line 105,col 53)",
        "(line 106,col 9)-(line 106,col 51)",
        "(line 108,col 9)-(line 108,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     * @param variant of the resulting Locale\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 59)",
        "(line 123,col 9)-(line 123,col 46)",
        "(line 124,col 9)-(line 124,col 53)",
        "(line 125,col 9)-(line 125,col 51)",
        "(line 126,col 9)-(line 126,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_1Part()",
      "begin_line": 133,
      "end_line": 174,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 64)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 141,col 9)-(line 141,col 34)",
        "(line 143,col 9)-(line 146,col 49)",
        "(line 147,col 9)-(line 150,col 49)",
        "(line 151,col 9)-(line 154,col 49)",
        "(line 155,col 9)-(line 158,col 49)",
        "(line 160,col 9)-(line 163,col 49)",
        "(line 165,col 9)-(line 168,col 49)",
        "(line 170,col 9)-(line 173,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_2Part()",
      "begin_line": 179,
      "end_line": 208,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 49)",
        "(line 182,col 9)-(line 182,col 49)",
        "(line 184,col 9)-(line 187,col 49)",
        "(line 188,col 9)-(line 191,col 49)",
        "(line 192,col 9)-(line 195,col 49)",
        "(line 196,col 9)-(line 199,col 49)",
        "(line 200,col 9)-(line 203,col 49)",
        "(line 204,col 9)-(line 207,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testToLocale_3Part()",
      "begin_line": 213,
      "end_line": 233,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 56)",
        "(line 217,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 232,col 49)"
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
      "end_line": 271,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 58)",
        "(line 259,col 9)-(line 259,col 73)",
        "(line 260,col 9)-(line 260,col 73)",
        "(line 261,col 9)-(line 261,col 73)",
        "(line 262,col 9)-(line 265,col 28)",
        "(line 266,col 9)-(line 270,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_LocaleLocale()",
      "begin_line": 276,
      "end_line": 324,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 41)",
        "(line 279,col 9)-(line 280,col 41)",
        "(line 282,col 9)-(line 285,col 28)",
        "(line 286,col 9)-(line 290,col 28)",
        "(line 291,col 9)-(line 295,col 31)",
        "(line 297,col 9)-(line 301,col 28)",
        "(line 302,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 312,col 28)",
        "(line 313,col 9)-(line 318,col 31)",
        "(line 319,col 9)-(line 323,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleList()",
      "begin_line": 330,
      "end_line": 340,
      "comment": "\n     * Test availableLocaleList() method.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 62)",
        "(line 332,col 9)-(line 332,col 63)",
        "(line 333,col 9)-(line 333,col 28)",
        "(line 334,col 9)-(line 334,col 32)",
        "(line 335,col 9)-(line 335,col 43)",
        "(line 337,col 9)-(line 337,col 63)",
        "(line 338,col 9)-(line 338,col 67)",
        "(line 339,col 9)-(line 339,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleSet()",
      "begin_line": 346,
      "end_line": 357,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 59)",
        "(line 348,col 9)-(line 348,col 60)",
        "(line 349,col 9)-(line 349,col 27)",
        "(line 350,col 9)-(line 350,col 30)",
        "(line 351,col 9)-(line 351,col 42)",
        "(line 353,col 9)-(line 353,col 63)",
        "(line 354,col 9)-(line 354,col 67)",
        "(line 355,col 9)-(line 355,col 70)",
        "(line 356,col 9)-(line 356,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testIsAvailableLocale()",
      "begin_line": 363,
      "end_line": 372,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 59)",
        "(line 365,col 9)-(line 365,col 88)",
        "(line 366,col 9)-(line 366,col 94)",
        "(line 367,col 9)-(line 367,col 104)",
        "(line 368,col 9)-(line 368,col 88)",
        "(line 369,col 9)-(line 369,col 94)",
        "(line 370,col 9)-(line 370,col 88)",
        "(line 371,col 9)-(line 371,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertLanguageByCountry(java.lang.String, java.lang.String[])",
      "begin_line": 384,
      "end_line": 411,
      "comment": "\n     * Make sure the language by country is correct. It checks that \n     * the LocaleUtils.languagesByCountry(country) call contains the \n     * array of languages passed in. It may contain more due to JVM \n     * variations.\n     *\n     * @param country\n     * @param languages array of languages that should be returned\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 68)",
        "(line 386,col 9)-(line 386,col 69)",
        "(line 387,col 9)-(line 387,col 28)",
        "(line 388,col 9)-(line 388,col 32)",
        "(line 390,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLanguagesByCountry()",
      "begin_line": 416,
      "end_line": 421,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 53)",
        "(line 418,col 9)-(line 418,col 58)",
        "(line 419,col 9)-(line 419,col 53)",
        "(line 420,col 9)-(line 420,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertCountriesByLanguage(java.lang.String, java.lang.String[])",
      "begin_line": 434,
      "end_line": 461,
      "comment": "\n     * Make sure the country by language is correct. It checks that \n     * the LocaleUtils.countryByLanguage(language) call contains the \n     * array of countries passed in. It may contain more due to JVM \n     * variations.\n     *\n     *\n     * @param language\n     * @param countries array of countries that should be returned\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 70)",
        "(line 436,col 9)-(line 436,col 71)",
        "(line 437,col 9)-(line 437,col 28)",
        "(line 438,col 9)-(line 438,col 32)",
        "(line 440,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testCountriesByLanguage()",
      "begin_line": 466,
      "end_line": 471,
      "comment": "\n     * Test countriesByLanguage() method.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 55)",
        "(line 468,col 9)-(line 468,col 78)",
        "(line 469,col 9)-(line 469,col 55)",
        "(line 470,col 9)-(line 470,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.assertUnmodifiableCollection(java.util.Collection\u003c?\u003e)",
      "begin_line": 476,
      "end_line": 481,
      "comment": "\n     * @param coll  the collection to check\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 480,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtilsTest.testLang328()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Tests #LANG-328 - only language+variant\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 60)"
      ]
    }
  ]
}