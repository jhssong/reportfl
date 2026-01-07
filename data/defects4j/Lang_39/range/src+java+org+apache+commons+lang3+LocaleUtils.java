{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/LocaleUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 318,
      "comment": "\n * \u003cp\u003eOperations to assist when working with a {@link Locale}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cAvailableLocaleList"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " lazily created by availableLocaleList()"
    },
    {
      "type": "field",
      "varNames": [
        "cAvailableLocaleSet"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " lazily created by availableLocaleSet()"
    },
    {
      "type": "field",
      "varNames": [
        "cLanguagesByCountry"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Unmodifiable map of language locales by country. "
    },
    {
      "type": "field",
      "varNames": [
        "cCountriesByLanguage"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Unmodifiable map of country locales by language. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.LocaleUtils.LocaleUtils()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eLocaleUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eLocaleUtils.toLocale(\"en_GB\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 64,col 7)-(line 64,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.toLocale(java.lang.String)",
      "begin_line": 95,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eConverts a String to a Locale.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method takes the string format of a locale and creates the\n     * locale object from it.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   LocaleUtils.toLocale(\"en\")         \u003d new Locale(\"en\", \"\")\n     *   LocaleUtils.toLocale(\"en_GB\")      \u003d new Locale(\"en\", \"GB\")\n     *   LocaleUtils.toLocale(\"en_GB_xxx\")  \u003d new Locale(\"en\", \"GB\", \"xxx\")   (#)\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e(#) The behaviour of the JDK variant constructor changed between JDK1.3 and JDK1.4.\n     * In JDK1.3, the constructor upper cases the variant, in JDK1.4, it doesn\u0027t.\n     * Thus, the result from getVariant() may vary depending on your JDK.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method validates the input strictly.\n     * The language code must be lowercase.\n     * The country code must be uppercase.\n     * The separator must be an underscore.\n     * The length must be correct.\n     * \u003c/p\u003e\n     *\n     * @param str  the locale String to convert, null returns null\n     * @return a Locale, null if null input\n     * @throws IllegalArgumentException if the string is an invalid format\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 31)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 33)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.localeLookupList(java.util.Locale)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eObtains the list of locales to search through when performing\n     * a locale search.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * localeLookupList(Locale(\"fr\",\"CA\",\"xxx\"))\n     *   \u003d [Locale(\"fr\",\"CA\",\"xxx\"), Locale(\"fr\",\"CA\"), Locale(\"fr\")]\n     * \u003c/pre\u003e\n     *\n     * @param locale  the locale to start from\n     * @return the unmodifiable list of Locale objects, 0 being locale, never null\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.localeLookupList(java.util.Locale, java.util.Locale)",
      "begin_line": 168,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eObtains the list of locales to search through when performing\n     * a locale search.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * localeLookupList(Locale(\"fr\", \"CA\", \"xxx\"), Locale(\"en\"))\n     *   \u003d [Locale(\"fr\",\"CA\",\"xxx\"), Locale(\"fr\",\"CA\"), Locale(\"fr\"), Locale(\"en\"]\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe result list begins with the most specific locale, then the\n     * next more general and so on, finishing with the default locale.\n     * The list will never contain the same locale twice.\u003c/p\u003e\n     *\n     * @param locale  the locale to start from, null returns empty list\n     * @param defaultLocale  the default locale to use if no other is found\n     * @return the unmodifiable list of Locale objects, 0 being locale, never null\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 53)",
        "(line 170,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.availableLocaleList()",
      "begin_line": 195,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eObtains an unmodifiable list of installed locales.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is a wrapper around {@link Locale#getAvailableLocales()}.\n     * It is more efficient, as the JDK method must create a new array each\n     * time it is called.\u003c/p\u003e\n     *\n     * @return the unmodifiable list of available locales\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.initAvailableLocaleList()",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * Initializes the availableLocaleList. It is separate from availableLocaleList() \n     * to avoid the synchronized block affecting normal use, yet synchronized and \n     * lazy loading to avoid a static block affecting other methods in this class. \n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.availableLocaleSet()",
      "begin_line": 224,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eObtains an unmodifiable set of installed locales.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is a wrapper around {@link Locale#getAvailableLocales()}.\n     * It is more efficient, as the JDK method must create a new array each\n     * time it is called.\u003c/p\u003e\n     *\n     * @return the unmodifiable set of available locales\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.initAvailableLocaleSet()",
      "begin_line": 236,
      "end_line": 240,
      "comment": "\n     * Initializes the availableLocaleSet. It is separate from availableLocaleSet() \n     * to avoid the synchronized block affecting normal use, yet synchronized and \n     * lazy loading to avoid a static block affecting other methods in this class. \n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.isAvailableLocale(java.util.Locale)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eChecks if the locale specified is in the list of available locales.\u003c/p\u003e\n     *\n     * @param locale the Locale object to check if it is available\n     * @return true if the locale is a known locale\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.languagesByCountry(java.lang.String)",
      "begin_line": 263,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003eObtains the list of languages supported for a given country.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method takes a country code and searches to find the\n     * languages available for that country. Variant locales are removed.\u003c/p\u003e\n     *\n     * @param countryCode  the 2 letter country code, null returns empty\n     * @return an unmodifiable List of Locale objects, never null\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 66)",
        "(line 265,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.LocaleUtils.countriesByLanguage(java.lang.String)",
      "begin_line": 295,
      "end_line": 316,
      "comment": "\n     * \u003cp\u003eObtains the list of countries supported for a given language.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method takes a language code and searches to find the\n     * countries available for that language. Variant locales are removed.\u003c/p\u003e\n     *\n     * @param languageCode  the 2 letter language code, null returns empty\n     * @return an unmodifiable List of Locale objects, never null\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 72)",
        "(line 297,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 25)"
      ]
    }
  ]
}