{
  "filepath": "/tmp/Codec-14b/src/main/java/org/apache/commons/codec/language/bm/Languages.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Languages",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 295,
      "comment": "\n * Language codes.\n * \u003cp\u003e\n * Language codes are typically loaded from resource files. These are UTF-8 encoded text files. They are\n * systematically named following the pattern:\n * \u003cblockquote\u003eorg/apache/commons/codec/language/bm/${{@link NameType#getName()} languages.txt\u003c/blockquote\u003e\n * \u003cp\u003e\n * The format of these resources is the following:\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003eLanguage:\u003c/b\u003e a single string containing no whitespace\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eEnd-of-line comments:\u003c/b\u003e Any occurrence of \u0027//\u0027 will cause all text following on that line to be\n * discarded as a comment.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eMulti-line comments:\u003c/b\u003e Any line starting with \u0027/*\u0027 will start multi-line commenting mode.\n * This will skip all content until a line ending in \u0027*\u0027 and \u0027/\u0027 is found.\u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eBlank lines:\u003c/b\u003e All blank lines will be skipped.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Ported from language.php\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @since 1.6\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "LanguageSet",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 78,
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
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.LanguageSet.merge(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
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
      "end_line": 153,
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
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.merge(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 132,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 145,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.SomeLanguages.toString()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ANY"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LANGUAGES"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getInstance(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getInstance(java.lang.String)",
      "begin_line": 169,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 53)",
        "(line 172,col 9)-(line 172,col 111)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 82)",
        "(line 179,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.langResourceName(org.apache.commons.codec.language.bm.NameType)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 106)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "languages"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_LANGUAGES"
      ],
      "begin_line": 211,
      "end_line": 246,
      "comment": "\n     * No languages at all.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-166720fc-b892-432e-89eb-07f3a75364f6.contains(java.lang.String)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-dc0b94fb-ade9-46bb-9063-291077bc6807.getAny()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-0155d811-9eeb-4d34-8472-6a961a793952.isEmpty()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-7ac5926f-4121-400b-8713-b25fbf6b77ba.isSingleton()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 13)-(line 229,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-3153c2a9-4ec3-4ced-8317-6804ddfd42e6.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-cffc6787-79f9-4010-b228-be3adf031c54.merge(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-fbdc67a1-5831-43c5-ab3c-71c271e8902a.toString()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ANY_LANGUAGE"
      ],
      "begin_line": 251,
      "end_line": 286,
      "comment": "\n     * Any/all languages.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-d637033b-225b-4dbc-abb9-194e8a0a4fdb.contains(java.lang.String)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-370199dd-f097-4736-9037-f639c77a8c95.getAny()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-89e6029a-cecc-471f-8bfa-a219ce197b01.isEmpty()",
      "begin_line": 262,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-fbeb1a9d-c1d8-49d8-90e2-e6b4a5e2bf60.isSingleton()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-a68f8c78-a263-4eae-aaa1-9f28a3aef4e9.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-f422f449-f48b-4b79-89df-c1c11b1c183c.merge(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-37d4147e-6373-47d2-840b-2e8575d1133b.toString()",
      "begin_line": 282,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.bm.Languages.Languages(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.getLanguages()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 30)"
      ]
    }
  ]
}