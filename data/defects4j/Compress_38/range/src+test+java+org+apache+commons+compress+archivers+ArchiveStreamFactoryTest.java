{
  "filepath": "/tmp/Compress-38b/src/test/java/org/apache/commons/compress/archivers/ArchiveStreamFactoryTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactoryTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 405,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.shortTextFilesAreNoTARs()",
      "begin_line": 50,
      "end_line": 59,
      "comment": "\n     * see https://issues.apache.org/jira/browse/COMPRESS-171\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.aiffFilesAreNoTARs()",
      "begin_line": 64,
      "end_line": 80,
      "comment": "\n     * see https://issues.apache.org/jira/browse/COMPRESS-191\n     ",
      "child_ranges": [
        "(line 66,col 6)-(line 66,col 88)",
        "(line 67,col 6)-(line 79,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testCOMPRESS209()",
      "begin_line": 82,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 84,col 6)-(line 84,col 95)",
        "(line 85,col 6)-(line 97,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantRead7zFromStream()",
      "begin_line": 100,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantWrite7zToStream()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.detectsAndThrowsFor7z()",
      "begin_line": 119,
      "end_line": 135,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-267\"\n     * \u003eCOMPRESS-267\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 121,col 6)-(line 121,col 82)",
        "(line 122,col 6)-(line 134,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.skipsPK00Prefix()",
      "begin_line": 142,
      "end_line": 160,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 144,col 6)-(line 144,col 92)",
        "(line 145,col 6)-(line 159,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingCtor()",
      "begin_line": 162,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 62)",
        "(line 165,col 9)-(line 165,col 43)",
        "(line 166,col 9)-(line 166,col 45)",
        "(line 167,col 9)-(line 167,col 43)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 169,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingDeprecated()",
      "begin_line": 172,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 62)",
        "(line 176,col 9)-(line 176,col 43)",
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 178,col 54)",
        "(line 179,col 9)-(line 179,col 41)",
        "(line 180,col 9)-(line 180,col 57)",
        "(line 181,col 9)-(line 181,col 48)",
        "(line 182,col 9)-(line 182,col 54)",
        "(line 183,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 191,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testFile"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedEncoding"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fac"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldName"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasOutputStream"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.TestData.TestData(java.lang.String, java.lang.String, boolean, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory, java.lang.String)",
      "begin_line": 198,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 37)",
        "(line 200,col 13)-(line 200,col 53)",
        "(line 201,col 13)-(line 201,col 27)",
        "(line 202,col 13)-(line 202,col 39)",
        "(line 203,col 13)-(line 203,col 29)",
        "(line 204,col 13)-(line 204,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getFactory(java.lang.String)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 68)",
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The different factory types"
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_UTF8"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_ASCII"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_UTF8"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_ASCII"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_DEFAULT"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " The test currently assumes that the output default is the same as the input default"
    },
    {
      "type": "field",
      "varNames": [
        "DUMP_DEFAULT"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZIP_DEFAULT"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CPIO_DEFAULT"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAR_DEFAULT"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JAR_DEFAULT"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TESTS"
      ],
      "begin_line": 253,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStreamAutodetect()",
      "begin_line": 291,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 23)",
        "(line 294,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStream()",
      "begin_line": 308,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 23)",
        "(line 311,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingOutputStream()",
      "begin_line": 325,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 23)",
        "(line 328,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.eq(java.lang.String, java.lang.String)",
      "begin_line": 345,
      "end_line": 350,
      "comment": " equals allowing null",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getField(java.lang.Object, java.lang.String)",
      "begin_line": 352,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 49)",
        "(line 354,col 9)-(line 354,col 18)",
        "(line 355,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 56)",
        "(line 366,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 386,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 390,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 393,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 398,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getOutputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 84)"
      ]
    }
  ]
}