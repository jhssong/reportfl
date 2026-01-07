{
  "filepath": "/tmp/Codec-11b/src/main/java/org/apache/commons/codec/language/bm/Languages.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Languages",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 269,
      "comment": "\n * \u003cp\u003e\n * Language codes.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Language codes are typically loaded from resource files. These are UTF-8 encoded text files. They are systematically named following the\n * pattern:\n * \u003c/p\u003e\n * \u003cblockquote\u003eorg/apache/commons/codec/language/bm/${{@link NameType#getName()} languages.txt\u003c/blockquote\u003e\n * \u003cp\u003e\n * The format of these resources is the following:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003eLanguage:\u003c/b\u003e a single string containing no whitespace\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eEnd-of-line comments:\u003c/b\u003e Any occurance of \u0027//\u0027 will cause all text following on that line to be discarded as a comment.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eMulti-line comments:\u003c/b\u003e Any line starting with \u0027/*\u0027 will start multi-line commenting mode. This will skip all content until a\n * line ending in \u0027*\u0027 and \u0027/\u0027 is found.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eBlank lines:\u003c/b\u003e All blank lines will be skipped.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Ported from language.php\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 1.6\n "
    },
    {
      "type": "class_interface",
      "name": "LanguageSet",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 78,
      "comment": "\n     * A set of languages.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.from(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.contains(java.lang.String)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.getAny()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.isEmpty()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.isSingleton()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SomeLanguages",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.bm.Languages.LanguageSet"
      ],
      "begin_line": 83,
      "end_line": 137,
      "comment": "\n     * Some languages, explicitly enumerated.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.SomeLanguages(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.contains(java.lang.String)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.getAny()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.getLanguages()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.isEmpty()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.isSingleton()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 114,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 129,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.toString()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ANY"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LANGUAGES"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getInstance(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getInstance(java.lang.String)",
      "begin_line": 153,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 47)",
        "(line 156,col 9)-(line 156,col 105)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 76)",
        "(line 163,col 9)-(line 163,col 42)",
        "(line 164,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.langResourceName(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 106)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_LANGUAGES"
      ],
      "begin_line": 195,
      "end_line": 225,
      "comment": "\n     * No languages at all.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-a7023904-0c0f-4e39-b789-5b76f1f22c13.contains(java.lang.String)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-ad57b981-7ba7-492f-a975-f195ef800ac9.getAny()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-21d49dd3-6151-4501-bf4e-69e2e0feb9b4.isEmpty()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-25c99d33-00eb-4f5b-bf73-9512cff8b211.isSingleton()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-ff1c9d34-9bce-4c51-8c9c-5228b40bc17b.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-fd244d08-2e48-4c90-b6d8-cec53d8e0860.toString()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ANY_LANGUAGE"
      ],
      "begin_line": 230,
      "end_line": 260,
      "comment": "\n     * Any/all languages.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-5f76090f-2007-451c-8403-83789a46f6aa.contains(java.lang.String)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-9539b19c-aaed-41dd-a322-cbd825247bfd.getAny()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-5d033668-359c-400e-8559-de4f0918c478.isEmpty()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-3b5e9636-eb89-49d4-88e6-ab80c0072965.isSingleton()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-ee113535-2461-4b07-90f3-90b0a86209e4.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-653e3917-fe99-4e50-a287-dbdd912db81c.toString()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Languages.Languages(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getLanguages()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 30)"
      ]
    }
  ]
}