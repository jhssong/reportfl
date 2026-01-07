{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 34,
      "end_line": 205,
      "comment": "\n * Implements the \"ar\" archive format as an input stream.\n * \n * @NotThreadSafe\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntry"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * If getNextEnxtry has been called, the entry metadata is stored in\n     * currentEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The offset where the current entry started. -1 if no entry has been\n     * called\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 23)",
        "(line 52,col 9)-(line 52,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 62,
      "end_line": 140,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 102,col 49)",
        "(line 103,col 9)-(line 103,col 42)",
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 106,col 43)",
        "(line 108,col 9)-(line 108,col 19)",
        "(line 109,col 9)-(line 109,col 27)",
        "(line 110,col 9)-(line 110,col 21)",
        "(line 111,col 9)-(line 111,col 22)",
        "(line 112,col 9)-(line 112,col 23)",
        "(line 113,col 9)-(line 113,col 21)",
        "(line 115,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 29)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 67)",
        "(line 139,col 9)-(line 139,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 147,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 155,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)",
        "(line 157,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 56)",
        "(line 166,col 9)-(line 166,col 19)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 171,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    }
  ]
}