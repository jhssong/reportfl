{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/bm/Languages.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Languages",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 267,
      "comment": "\n * Language codes.\n * \u003cp\u003e\n * Language codes are typically loaded from resource files. These are UTF-8 encoded text files. They are\n * systematically named following the pattern:\n * \u003cblockquote\u003eorg/apache/commons/codec/language/bm/${{@link NameType#getName()} languages.txt\u003c/blockquote\u003e\n * \u003cp\u003e\n * The format of these resources is the following:\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003eLanguage:\u003c/b\u003e a single string containing no whitespace\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eEnd-of-line comments:\u003c/b\u003e Any occurrence of \u0027//\u0027 will cause all text following on that line to be\n * discarded as a comment.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eMulti-line comments:\u003c/b\u003e Any line starting with \u0027/*\u0027 will start multi-line commenting mode.\n * This will skip all content until a line ending in \u0027*\u0027 and \u0027/\u0027 is found.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eBlank lines:\u003c/b\u003e All blank lines will be skipped.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Ported from language.php\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @since 1.6\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "LanguageSet",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 76,
      "comment": "\n     * A set of languages.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.from(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.contains(java.lang.String)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.getAny()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.isEmpty()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.isSingleton()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 75,
      "end_line": 75,
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
      "begin_line": 81,
      "end_line": 135,
      "comment": "\n     * Some languages, explicitly enumerated.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.SomeLanguages(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.contains(java.lang.String)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.getAny()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.getLanguages()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.isEmpty()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.isSingleton()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 112,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 114,col 13)-(line 127,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.toString()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ANY"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LANGUAGES"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getInstance(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getInstance(java.lang.String)",
      "begin_line": 151,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 53)",
        "(line 154,col 9)-(line 154,col 111)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 82)",
        "(line 161,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.langResourceName(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 106)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_LANGUAGES"
      ],
      "begin_line": 193,
      "end_line": 223,
      "comment": "\n     * No languages at all.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-9972fb03-088b-40b3-a65d-c9320dd35bff.contains(java.lang.String)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-5f645370-6f5c-4b0d-b05a-9c0a03a3794b.getAny()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 13)-(line 201,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-4f52e208-f83d-4de4-9c7a-d512e36041c9.isEmpty()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-40595867-57ba-4e9f-afbf-629a66739e4c.isSingleton()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-10599658-9fde-46e3-9153-6f3e4ce99167.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-e801eca8-090b-4d8f-b0c7-e5dfdd296e61.toString()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 13)-(line 221,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ANY_LANGUAGE"
      ],
      "begin_line": 228,
      "end_line": 258,
      "comment": "\n     * Any/all languages.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-cc2de7a9-1033-4c60-92bf-bf85621deaca.contains(java.lang.String)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-4810f2c0-e557-4a5e-8c35-c98efd71a04e.getAny()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-0cac373f-0442-42d4-8351-bd621b118be7.isEmpty()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-25490827-4b34-4631-bb07-6f5dae3b0444.isSingleton()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-7aa28059-2417-4efd-b302-7aabdb82b07a.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-b901cb5a-80f2-4e48-a11e-bd2dc57cbf45.toString()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Languages.Languages(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getLanguages()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 30)"
      ]
    }
  ]
}