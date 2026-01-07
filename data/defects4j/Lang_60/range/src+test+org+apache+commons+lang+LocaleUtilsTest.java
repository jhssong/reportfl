{
  "filepath": "/tmp/Lang-60b/src/test/org/apache/commons/lang/LocaleUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 491,
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
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testConstructor()",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\n     * Test that constructors are public, and work, etc.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 41)",
        "(line 84,col 9)-(line 84,col 73)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 86,col 70)",
        "(line 87,col 9)-(line 87,col 80)",
        "(line 88,col 9)-(line 88,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param language  the language string\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 55)",
        "(line 99,col 9)-(line 99,col 46)",
        "(line 100,col 9)-(line 100,col 53)",
        "(line 102,col 9)-(line 102,col 85)",
        "(line 103,col 9)-(line 103,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 59)",
        "(line 115,col 9)-(line 115,col 46)",
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 117,col 51)",
        "(line 119,col 9)-(line 119,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertValidToLocale(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 130,
      "end_line": 139,
      "comment": "\n     * Pass in a valid language, test toLocale.\n     *\n     * @param localeString to pass to toLocale()\n     * @param language of the resulting Locale\n     * @param country of the resulting Locale\n     * @param variant of the resulting Locale\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 59)",
        "(line 134,col 9)-(line 134,col 46)",
        "(line 135,col 9)-(line 135,col 53)",
        "(line 136,col 9)-(line 136,col 51)",
        "(line 137,col 9)-(line 137,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_1Part()",
      "begin_line": 144,
      "end_line": 185,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 64)",
        "(line 147,col 9)-(line 147,col 34)",
        "(line 148,col 9)-(line 148,col 34)",
        "(line 149,col 9)-(line 149,col 34)",
        "(line 150,col 9)-(line 150,col 34)",
        "(line 152,col 9)-(line 152,col 34)",
        "(line 154,col 9)-(line 157,col 49)",
        "(line 158,col 9)-(line 161,col 49)",
        "(line 162,col 9)-(line 165,col 49)",
        "(line 166,col 9)-(line 169,col 49)",
        "(line 171,col 9)-(line 174,col 49)",
        "(line 176,col 9)-(line 179,col 49)",
        "(line 181,col 9)-(line 184,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_2Part()",
      "begin_line": 190,
      "end_line": 219,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 49)",
        "(line 193,col 9)-(line 193,col 49)",
        "(line 195,col 9)-(line 198,col 49)",
        "(line 199,col 9)-(line 202,col 49)",
        "(line 203,col 9)-(line 206,col 49)",
        "(line 207,col 9)-(line 210,col 49)",
        "(line 211,col 9)-(line 214,col 49)",
        "(line 215,col 9)-(line 218,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testToLocale_3Part()",
      "begin_line": 224,
      "end_line": 244,
      "comment": "\n     * Test toLocale() method.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 56)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 239,col 49)",
        "(line 240,col 9)-(line 243,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertLocaleLookupList(java.util.Locale, java.util.Locale, java.util.Locale[])",
      "begin_line": 254,
      "end_line": 262,
      "comment": "\n     * Helper method for local lookups.\n     *\n     * @param locale  the input locale\n     * @param defaultLocale  the input default locale\n     * @param expected  expected results\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 68)",
        "(line 259,col 9)-(line 259,col 57)",
        "(line 260,col 9)-(line 260,col 58)",
        "(line 261,col 9)-(line 261,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLocaleLookupList_Locale()",
      "begin_line": 268,
      "end_line": 282,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 58)",
        "(line 270,col 9)-(line 270,col 73)",
        "(line 271,col 9)-(line 271,col 73)",
        "(line 272,col 9)-(line 272,col 73)",
        "(line 273,col 9)-(line 276,col 28)",
        "(line 277,col 9)-(line 281,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLocaleLookupList_LocaleLocale()",
      "begin_line": 287,
      "end_line": 335,
      "comment": "\n     * Test localeLookupList() method.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 41)",
        "(line 290,col 9)-(line 291,col 41)",
        "(line 293,col 9)-(line 296,col 28)",
        "(line 297,col 9)-(line 301,col 28)",
        "(line 302,col 9)-(line 306,col 31)",
        "(line 308,col 9)-(line 312,col 28)",
        "(line 313,col 9)-(line 317,col 28)",
        "(line 318,col 9)-(line 323,col 28)",
        "(line 324,col 9)-(line 329,col 31)",
        "(line 330,col 9)-(line 334,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testAvailableLocaleList()",
      "begin_line": 341,
      "end_line": 351,
      "comment": "\n     * Test availableLocaleList() method.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 54)",
        "(line 343,col 9)-(line 343,col 55)",
        "(line 344,col 9)-(line 344,col 28)",
        "(line 345,col 9)-(line 345,col 32)",
        "(line 346,col 9)-(line 346,col 43)",
        "(line 348,col 9)-(line 348,col 63)",
        "(line 349,col 9)-(line 349,col 59)",
        "(line 350,col 9)-(line 350,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testAvailableLocaleSet()",
      "begin_line": 357,
      "end_line": 368,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 51)",
        "(line 359,col 9)-(line 359,col 52)",
        "(line 360,col 9)-(line 360,col 27)",
        "(line 361,col 9)-(line 361,col 30)",
        "(line 362,col 9)-(line 362,col 42)",
        "(line 364,col 9)-(line 364,col 63)",
        "(line 365,col 9)-(line 365,col 59)",
        "(line 366,col 9)-(line 366,col 54)",
        "(line 367,col 9)-(line 367,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testIsAvailableLocale()",
      "begin_line": 374,
      "end_line": 383,
      "comment": "\n     * Test availableLocaleSet() method.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 51)",
        "(line 376,col 9)-(line 376,col 88)",
        "(line 377,col 9)-(line 377,col 94)",
        "(line 378,col 9)-(line 378,col 104)",
        "(line 379,col 9)-(line 379,col 88)",
        "(line 380,col 9)-(line 380,col 94)",
        "(line 381,col 9)-(line 381,col 88)",
        "(line 382,col 9)-(line 382,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertLanguageByCountry(java.lang.String, java.lang.String[])",
      "begin_line": 392,
      "end_line": 420,
      "comment": "\n     * Make sure the language by country is correct.\n     *\n     * @param country\n     * @param languages array of languages that should be returned\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 60)",
        "(line 394,col 9)-(line 394,col 61)",
        "(line 395,col 9)-(line 395,col 28)",
        "(line 396,col 9)-(line 396,col 32)",
        "(line 397,col 9)-(line 397,col 52)",
        "(line 399,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testLanguagesByCountry()",
      "begin_line": 425,
      "end_line": 430,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 53)",
        "(line 427,col 9)-(line 427,col 58)",
        "(line 428,col 9)-(line 428,col 53)",
        "(line 429,col 9)-(line 429,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertCountriesByLanguage(java.lang.String, java.lang.String[])",
      "begin_line": 439,
      "end_line": 467,
      "comment": "\n     * Make sure the language by country is correct.\n     *\n     * @param language\n     * @param countries array of countries that should be returned\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 62)",
        "(line 441,col 9)-(line 441,col 63)",
        "(line 442,col 9)-(line 442,col 28)",
        "(line 443,col 9)-(line 443,col 32)",
        "(line 444,col 9)-(line 444,col 52)",
        "(line 446,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.testCountriesByLanguage()",
      "begin_line": 472,
      "end_line": 472,
      "comment": "\n     * Test languagesByCountry() method.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtilsTest.assertUnmodifiableCollection(java.util.Collection)",
      "begin_line": 484,
      "end_line": 489,
      "comment": "\n     * @param coll  the collection to check\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 488,col 53)"
      ]
    }
  ]
}