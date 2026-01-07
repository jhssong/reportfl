{
  "filepath": "/tmp/Compress-34b/src/test/java/org/apache/commons/compress/archivers/ArchiveStreamFactoryTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactoryTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 404,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.shortTextFilesAreNoTARs()",
      "begin_line": 48,
      "end_line": 57,
      "comment": "\n     * see https://issues.apache.org/jira/browse/COMPRESS-171\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.aiffFilesAreNoTARs()",
      "begin_line": 62,
      "end_line": 78,
      "comment": "\n     * see https://issues.apache.org/jira/browse/COMPRESS-191\n     ",
      "child_ranges": [
        "(line 64,col 6)-(line 64,col 82)",
        "(line 65,col 6)-(line 77,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testCOMPRESS209()",
      "begin_line": 80,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 82,col 6)-(line 82,col 89)",
        "(line 83,col 6)-(line 95,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantRead7zFromStream()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantWrite7zToStream()",
      "begin_line": 105,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.detectsAndThrowsFor7z()",
      "begin_line": 117,
      "end_line": 133,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-267\"\n     * \u003eCOMPRESS-267\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 119,col 6)-(line 119,col 76)",
        "(line 120,col 6)-(line 132,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.skipsPK00Prefix()",
      "begin_line": 140,
      "end_line": 158,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 142,col 6)-(line 142,col 86)",
        "(line 143,col 6)-(line 157,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingCtor()",
      "begin_line": 160,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 62)",
        "(line 163,col 9)-(line 163,col 43)",
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 165,col 43)",
        "(line 166,col 9)-(line 166,col 48)",
        "(line 167,col 9)-(line 167,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingDeprecated()",
      "begin_line": 170,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 62)",
        "(line 174,col 9)-(line 174,col 43)",
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 176,col 54)",
        "(line 177,col 9)-(line 177,col 41)",
        "(line 178,col 9)-(line 178,col 57)",
        "(line 179,col 9)-(line 179,col 48)",
        "(line 180,col 9)-(line 180,col 54)",
        "(line 181,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 189,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testFile"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedEncoding"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fac"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldName"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasOutputStream"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.TestData.TestData(java.lang.String, java.lang.String, boolean, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory, java.lang.String)",
      "begin_line": 196,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 37)",
        "(line 198,col 13)-(line 198,col 53)",
        "(line 199,col 13)-(line 199,col 27)",
        "(line 200,col 13)-(line 200,col 39)",
        "(line 201,col 13)-(line 201,col 29)",
        "(line 202,col 13)-(line 202,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getFactory(java.lang.String)",
      "begin_line": 206,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 62)",
        "(line 209,col 9)-(line 209,col 44)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " The different factory types"
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_UTF8"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_ASCII"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_UTF8"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_ASCII"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_DEFAULT"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " The test currently assumes that the output default is the same as the input default"
    },
    {
      "type": "field",
      "varNames": [
        "DUMP_DEFAULT"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZIP_DEFAULT"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CPIO_DEFAULT"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAR_DEFAULT"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JAR_DEFAULT"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TESTS"
      ],
      "begin_line": 251,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStreamAutodetect()",
      "begin_line": 289,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 23)",
        "(line 292,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStream()",
      "begin_line": 306,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 23)",
        "(line 309,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingOutputStream()",
      "begin_line": 323,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 23)",
        "(line 326,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.eq(java.lang.String, java.lang.String)",
      "begin_line": 343,
      "end_line": 348,
      "comment": " equals allowing null",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getField(java.lang.Object, java.lang.String)",
      "begin_line": 350,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 18)",
        "(line 353,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 50)",
        "(line 364,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 385,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 392,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 397,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getOutputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 84)"
      ]
    }
  ]
}