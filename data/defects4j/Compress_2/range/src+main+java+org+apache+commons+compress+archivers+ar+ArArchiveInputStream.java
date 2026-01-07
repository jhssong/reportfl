{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 33,
      "end_line": 182,
      "comment": "\n * Implements the \"ar\" archive format as an input stream.\n * \n * @NotThreadSafe\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 23)",
        "(line 49,col 9)-(line 49,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 59,
      "end_line": 117,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 75,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 87,col 49)",
        "(line 88,col 9)-(line 88,col 42)",
        "(line 89,col 9)-(line 89,col 43)",
        "(line 90,col 9)-(line 90,col 44)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 93,col 9)-(line 93,col 19)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 21)",
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 98,col 21)",
        "(line 100,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 116,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read()",
      "begin_line": 131,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 37)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[])",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 25)",
        "(line 143,col 9)-(line 143,col 56)",
        "(line 144,col 9)-(line 144,col 38)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 148,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 20)"
      ]
    }
  ]
}