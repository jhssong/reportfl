{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/LocaleUtilsTest.java",
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
      "comment": "\n * Unit tests for {@link LocaleUtils}.\n *\n * @author Chris Hyzer\n * @author Stephen Colebourne\n * @version $Id: LocaleUtilsTest.java 307282 2005-10-08 10:04:20Z scolebourne $\n "
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
      "signature": "org.apache.commons.lang.LocaleUtilsTest.LocaleUtilsTest(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructor.\n     * \n     * @param name\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.main(java.lang.String[])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Main.\n     * @param args\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.suite()",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Run the test cases as a suite.\n     * @return the Test\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 63)",
        "(line 73,col 9)-(line 73,col 47)",
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testConstructor()",
      "begin_line": 81,
      "end_line": 88,
      "comment": "\n     * Test that constructors are public, and work, etc.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 41)",
        "(line 83,col 9)-(line 83,col 73)",
        "(line 84,col 9)-(line 84,col 37)",
        "(line 85,col 9)-(line 85,col 70)",
        "(line 86,col 9)-(line 86,col 80)",
        "(line 87,col 9)-(line 87,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param language  the language string\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 55)",
        "(line 98,col 9)-(line 98,col 46)",
        "(line 99,col 9)-(line 99,col 53)",
        "(line 101,col 9)-(line 101,col 85)",
        "(line 102,col 9)-(line 102,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 112,
      "end_line": 119,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 59)",
        "(line 114,col 9)-(line 114,col 46)",
        "(line 115,col 9)-(line 115,col 53)",
        "(line 116,col 9)-(line 116,col 51)",
        "(line 118,col 9)-(line 118,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 129,
      "end_line": 138,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     * @param variant of the resulting Locale\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 59)",
        "(line 133,col 9)-(line 133,col 46)",
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 51)",
        "(line 136,col 9)-(line 136,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_1Part()",
      "begin_line": 143,
      "end_line": 184,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 64)",
        "(line 146,col 9)-(line 146,col 34)",
        "(line 147,col 9)-(line 147,col 34)",
        "(line 148,col 9)-(line 148,col 34)",
        "(line 149,col 9)-(line 149,col 34)",
        "(line 151,col 9)-(line 151,col 34)",
        "(line 153,col 9)-(line 156,col 49)",
        "(line 157,col 9)-(line 160,col 49)",
        "(line 161,col 9)-(line 164,col 49)",
        "(line 165,col 9)-(line 168,col 49)",
        "(line 170,col 9)-(line 173,col 49)",
        "(line 175,col 9)-(line 178,col 49)",
        "(line 180,col 9)-(line 183,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_2Part()",
      "begin_line": 189,
      "end_line": 218,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 49)",
        "(line 192,col 9)-(line 192,col 49)",
        "(line 194,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 201,col 49)",
        "(line 202,col 9)-(line 205,col 49)",
        "(line 206,col 9)-(line 209,col 49)",
        "(line 210,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 217,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_3Part()",
      "begin_line": 223,
      "end_line": 243,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 56)",
        "(line 227,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 238,col 49)",
        "(line 239,col 9)-(line 242,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertLocaleLookupList(java.util.Locale, java.util.Locale, java.util.Locale[])",
      "begin_line": 253,
      "end_line": 261,
      "comment": "\n     * Helper method for local lookups.\n     *\n     * @param locale  the input locale\n     * @param defaultLocale  the input default locale\n     * @param expected  expected results\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 68)",
        "(line 258,col 9)-(line 258,col 57)",
        "(line 259,col 9)-(line 259,col 58)",
        "(line 260,col 9)-(line 260,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLocaleLookupList_Locale()",
      "begin_line": 267,
      "end_line": 281,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 58)",
        "(line 269,col 9)-(line 269,col 73)",
        "(line 270,col 9)-(line 270,col 73)",
        "(line 271,col 9)-(line 271,col 73)",
        "(line 272,col 9)-(line 275,col 28)",
        "(line 276,col 9)-(line 280,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLocaleLookupList_LocaleLocale()",
      "begin_line": 286,
      "end_line": 334,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 288,col 41)",
        "(line 289,col 9)-(line 290,col 41)",
        "(line 292,col 9)-(line 295,col 28)",
        "(line 296,col 9)-(line 300,col 28)",
        "(line 301,col 9)-(line 305,col 31)",
        "(line 307,col 9)-(line 311,col 28)",
        "(line 312,col 9)-(line 316,col 28)",
        "(line 317,col 9)-(line 322,col 28)",
        "(line 323,col 9)-(line 328,col 31)",
        "(line 329,col 9)-(line 333,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testAvailableLocaleList()",
      "begin_line": 340,
      "end_line": 350,
      "comment": "\n     * Test availableLocaleList() method.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 54)",
        "(line 342,col 9)-(line 342,col 55)",
        "(line 343,col 9)-(line 343,col 28)",
        "(line 344,col 9)-(line 344,col 32)",
        "(line 345,col 9)-(line 345,col 43)",
        "(line 347,col 9)-(line 347,col 63)",
        "(line 348,col 9)-(line 348,col 59)",
        "(line 349,col 9)-(line 349,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testAvailableLocaleSet()",
      "begin_line": 356,
      "end_line": 367,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 51)",
        "(line 358,col 9)-(line 358,col 52)",
        "(line 359,col 9)-(line 359,col 27)",
        "(line 360,col 9)-(line 360,col 30)",
        "(line 361,col 9)-(line 361,col 42)",
        "(line 363,col 9)-(line 363,col 63)",
        "(line 364,col 9)-(line 364,col 59)",
        "(line 365,col 9)-(line 365,col 54)",
        "(line 366,col 9)-(line 366,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testIsAvailableLocale()",
      "begin_line": 373,
      "end_line": 382,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 51)",
        "(line 375,col 9)-(line 375,col 88)",
        "(line 376,col 9)-(line 376,col 94)",
        "(line 377,col 9)-(line 377,col 104)",
        "(line 378,col 9)-(line 378,col 88)",
        "(line 379,col 9)-(line 379,col 94)",
        "(line 380,col 9)-(line 380,col 88)",
        "(line 381,col 9)-(line 381,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertLanguageByCountry(java.lang.String, java.lang.String[])",
      "begin_line": 391,
      "end_line": 419,
      "comment": "\n     * Make sure the language by country is correct.\n     *\n     * @param country\n     * @param languages array of languages that should be returned\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 60)",
        "(line 393,col 9)-(line 393,col 61)",
        "(line 394,col 9)-(line 394,col 28)",
        "(line 395,col 9)-(line 395,col 32)",
        "(line 396,col 9)-(line 396,col 52)",
        "(line 398,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLanguagesByCountry()",
      "begin_line": 424,
      "end_line": 429,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 53)",
        "(line 426,col 9)-(line 426,col 58)",
        "(line 427,col 9)-(line 427,col 53)",
        "(line 428,col 9)-(line 428,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertCountriesByLanguage(java.lang.String, java.lang.String[])",
      "begin_line": 438,
      "end_line": 466,
      "comment": "\n     * Make sure the language by country is correct.\n     *\n     * @param language\n     * @param countries array of countries that should be returned\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 62)",
        "(line 440,col 9)-(line 440,col 63)",
        "(line 441,col 9)-(line 441,col 28)",
        "(line 442,col 9)-(line 442,col 32)",
        "(line 443,col 9)-(line 443,col 52)",
        "(line 445,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testCountriesByLanguage()",
      "begin_line": 471,
      "end_line": 471,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertUnmodifiableCollection(java.util.Collection)",
      "begin_line": 483,
      "end_line": 488,
      "comment": "\n     * @param coll  the collection to check\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 487,col 53)"
      ]
    }
  ]
}