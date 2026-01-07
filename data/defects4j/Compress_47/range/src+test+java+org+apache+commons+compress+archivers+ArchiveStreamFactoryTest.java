{
  "filepath": "/tmp/Compress-47b/src/test/java/org/apache/commons/compress/archivers/ArchiveStreamFactoryTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactoryTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.shortTextFilesAreNoTARs()",
      "begin_line": 51,
      "end_line": 60,
      "comment": "\n     * see https://issues.apache.org/jira/browse/COMPRESS-171\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.aiffFilesAreNoTARs()",
      "begin_line": 65,
      "end_line": 75,
      "comment": "\n     * see https://issues.apache.org/jira/browse/COMPRESS-191\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testCOMPRESS209()",
      "begin_line": 77,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantRead7zFromStream()",
      "begin_line": 89,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantWrite7zToStream()",
      "begin_line": 96,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.detectsAndThrowsFor7z()",
      "begin_line": 108,
      "end_line": 118,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-267\"\n     * \u003eCOMPRESS-267\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.skipsPK00Prefix()",
      "begin_line": 125,
      "end_line": 134,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingCtor()",
      "begin_line": 136,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 62)",
        "(line 139,col 9)-(line 139,col 43)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 141,col 43)",
        "(line 142,col 9)-(line 142,col 48)",
        "(line 143,col 9)-(line 143,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingDeprecated()",
      "begin_line": 146,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 62)",
        "(line 150,col 9)-(line 150,col 43)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 152,col 54)",
        "(line 153,col 9)-(line 153,col 41)",
        "(line 154,col 9)-(line 154,col 57)",
        "(line 155,col 9)-(line 155,col 48)",
        "(line 156,col 9)-(line 156,col 54)",
        "(line 157,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 165,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testFile"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedEncoding"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fac"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldName"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasOutputStream"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.TestData.TestData(java.lang.String, java.lang.String, boolean, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory, java.lang.String)",
      "begin_line": 173,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 37)",
        "(line 175,col 13)-(line 175,col 53)",
        "(line 176,col 13)-(line 176,col 27)",
        "(line 177,col 13)-(line 177,col 39)",
        "(line 178,col 13)-(line 178,col 29)",
        "(line 179,col 13)-(line 179,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.TestData.toString()",
      "begin_line": 182,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 185,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getFactory(java.lang.String)",
      "begin_line": 189,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 68)",
        "(line 192,col 9)-(line 192,col 44)",
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " The different factory types"
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_UTF8"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_ASCII"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_UTF8"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_ASCII"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_DEFAULT"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The test currently assumes that the output default is the same as the input default"
    },
    {
      "type": "field",
      "varNames": [
        "DUMP_DEFAULT"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZIP_DEFAULT"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CPIO_DEFAULT"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAR_DEFAULT"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JAR_DEFAULT"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testDetect()",
      "begin_line": 230,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.detect(java.lang.String)",
      "begin_line": 268,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TESTS"
      ],
      "begin_line": 275,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStreamAutodetect()",
      "begin_line": 313,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 23)",
        "(line 316,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStream()",
      "begin_line": 332,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 23)",
        "(line 335,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingOutputStream()",
      "begin_line": 351,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 23)",
        "(line 354,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.eq(java.lang.String, java.lang.String)",
      "begin_line": 373,
      "end_line": 378,
      "comment": " equals allowing null",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getField(java.lang.Object, java.lang.String)",
      "begin_line": 380,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 49)",
        "(line 382,col 9)-(line 382,col 18)",
        "(line 383,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 56)",
        "(line 394,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 414,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 421,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 426,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getOutputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 429,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 84)"
      ]
    }
  ]
}