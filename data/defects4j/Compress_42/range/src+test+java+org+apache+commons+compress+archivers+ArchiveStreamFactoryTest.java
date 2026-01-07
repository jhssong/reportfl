{
  "filepath": "/tmp/Compress-42b/src/test/java/org/apache/commons/compress/archivers/ArchiveStreamFactoryTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactoryTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 387,
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
      "end_line": 74,
      "comment": "\n     * see https://issues.apache.org/jira/browse/COMPRESS-191\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testCOMPRESS209()",
      "begin_line": 76,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantRead7zFromStream()",
      "begin_line": 88,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.cantWrite7zToStream()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.detectsAndThrowsFor7z()",
      "begin_line": 107,
      "end_line": 117,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-267\"\n     * \u003eCOMPRESS-267\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.skipsPK00Prefix()",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingCtor()",
      "begin_line": 135,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 62)",
        "(line 138,col 9)-(line 138,col 43)",
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 140,col 43)",
        "(line 141,col 9)-(line 141,col 48)",
        "(line 142,col 9)-(line 142,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingDeprecated()",
      "begin_line": 145,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 62)",
        "(line 149,col 9)-(line 149,col 43)",
        "(line 150,col 9)-(line 150,col 38)",
        "(line 151,col 9)-(line 151,col 54)",
        "(line 152,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 153,col 57)",
        "(line 154,col 9)-(line 154,col 48)",
        "(line 155,col 9)-(line 155,col 54)",
        "(line 156,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 164,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testFile"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedEncoding"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fac"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldName"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasOutputStream"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.TestData.TestData(java.lang.String, java.lang.String, boolean, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory, java.lang.String)",
      "begin_line": 172,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 173,col 13)-(line 173,col 37)",
        "(line 174,col 13)-(line 174,col 53)",
        "(line 175,col 13)-(line 175,col 27)",
        "(line 176,col 13)-(line 176,col 39)",
        "(line 177,col 13)-(line 177,col 29)",
        "(line 178,col 13)-(line 178,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.TestData.toString()",
      "begin_line": 181,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 184,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getFactory(java.lang.String)",
      "begin_line": 188,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 68)",
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 192,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The different factory types"
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_UTF8"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_ASCII"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_UTF8"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_SET_ASCII"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_DEFAULT"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " The test currently assumes that the output default is the same as the input default"
    },
    {
      "type": "field",
      "varNames": [
        "DUMP_DEFAULT"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZIP_DEFAULT"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CPIO_DEFAULT"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAR_DEFAULT"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JAR_DEFAULT"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TESTS"
      ],
      "begin_line": 229,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStreamAutodetect()",
      "begin_line": 267,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 23)",
        "(line 270,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingInputStream()",
      "begin_line": 286,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 23)",
        "(line 289,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.testEncodingOutputStream()",
      "begin_line": 305,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 23)",
        "(line 308,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.eq(java.lang.String, java.lang.String)",
      "begin_line": 327,
      "end_line": 332,
      "comment": " equals allowing null",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getField(java.lang.Object, java.lang.String)",
      "begin_line": 334,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 49)",
        "(line 336,col 9)-(line 336,col 18)",
        "(line 337,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 56)",
        "(line 348,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 368,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getInputStreamFor(java.lang.String, java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 375,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 380,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactoryTest.getOutputStreamFor(java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamFactory)",
      "begin_line": 383,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 84)"
      ]
    }
  ]
}