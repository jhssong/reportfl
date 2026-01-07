{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/language/bm/Languages.java",
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
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-bafa75e8-5ece-4f62-be1d-6a480874b9c7.contains(java.lang.String)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-f539fb81-aae7-4caa-886f-5f42b58e4e10.getAny()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-b8b62508-3379-496e-9db3-0ef87c31c67d.isEmpty()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-3452f1c7-3532-4a0a-985d-1c054ea66aa0.isSingleton()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-6bfef044-4ea3-4399-b5bb-918519775466.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-7fbb58c0-8a5a-4217-84ee-09f4acb137e1.toString()",
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
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-5cc951a4-1b8c-4408-878a-2f28a637b99e.contains(java.lang.String)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-be0b4ec5-53f2-4c86-b429-c235c3874c54.getAny()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-cff4806a-f65e-48bc-858c-c4190e57e68e.isEmpty()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-0498fb8f-6428-46c8-a709-ee18612c3b32.isSingleton()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-1d9caf15-cc06-4baa-8275-73b50e86a0bf.restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.bm.Languages.Anonymous-8630c361-9300-45e8-91fa-b971ea840ab2.toString()",
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