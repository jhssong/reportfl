{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, java.lang.String)",
      "begin_line": 37,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 43,col 9)",
        "(line 44,col 9)-(line 45,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "coderTable"
      ],
      "begin_line": 48,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CoderId",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderId.CoderId(byte[], org.apache.commons.compress.archivers.sevenz.Coders.CoderBase)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 25)",
        "(line 60,col 13)-(line 60,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coder"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CoderBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, java.lang.String)",
      "begin_line": 68,
      "end_line": 69,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 72,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, java.lang.String)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LZMA2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 80,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.LZMA2Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, java.lang.String)",
      "begin_line": 81,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 70)",
        "(line 85,col 13)-(line 87,col 13)",
        "(line 88,col 13)-(line 90,col 13)",
        "(line 91,col 13)-(line 91,col 37)",
        "(line 92,col 13)-(line 96,col 13)",
        "(line 97,col 13)-(line 97,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 111,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, java.lang.String)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AES256SHA256Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 119,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, java.lang.String)",
      "begin_line": 120,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 214,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "isInitialized"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cipherInputStream"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-3dafb740-2e7a-4f5e-94c7-1fe3f62e2abe.init()",
      "begin_line": 127,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 128,col 21)-(line 130,col 21)",
        "(line 131,col 21)-(line 131,col 65)",
        "(line 132,col 21)-(line 132,col 60)",
        "(line 133,col 21)-(line 133,col 65)",
        "(line 134,col 21)-(line 134,col 75)",
        "(line 135,col 21)-(line 135,col 75)",
        "(line 137,col 21)-(line 139,col 21)",
        "(line 140,col 21)-(line 140,col 59)",
        "(line 141,col 21)-(line 141,col 77)",
        "(line 142,col 21)-(line 142,col 51)",
        "(line 143,col 21)-(line 143,col 84)",
        "(line 145,col 21)-(line 147,col 21)",
        "(line 148,col 21)-(line 148,col 79)",
        "(line 149,col 21)-(line 149,col 45)",
        "(line 150,col 21)-(line 180,col 21)",
        "(line 182,col 21)-(line 182,col 83)",
        "(line 183,col 21)-(line 198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-2d6ff9c2-2693-4fa0-a867-72862346ede9.read()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 21)-(line 203,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-d3f9319d-2ff0-4fed-92e0-016b93bc35a8.read(byte[], int, int)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 21)-(line 208,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-df4d94d9-be2a-4afb-8bbc-0ecfc1467683.close()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": []
    }
  ]
}