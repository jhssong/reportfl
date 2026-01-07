{
  "filepath": "/tmp/Compress-6b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 34,
      "end_line": 251,
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
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * If getNextEnxtry has been called, the entry metadata is stored in\n     * currentEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The offset where the current entry started. -1 if no entry has been\n     * called\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Constructs an Ar input stream with the referenced stream\n     * \n     * @param pInput\n     *            the ar input stream\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)",
        "(line 60,col 9)-(line 60,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 70,
      "end_line": 149,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 42)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 116,col 9)-(line 116,col 19)",
        "(line 117,col 9)-(line 117,col 27)",
        "(line 118,col 9)-(line 118,col 21)",
        "(line 119,col 9)-(line 119,col 22)",
        "(line 120,col 9)-(line 120,col 23)",
        "(line 121,col 9)-(line 121,col 21)",
        "(line 123,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 29)",
        "(line 141,col 9)-(line 141,col 62)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 147,col 64)",
        "(line 148,col 9)-(line 148,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asLong(byte[])",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[])",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveInputStream#getNextEntry()\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 178,
      "end_line": 184,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#close()\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 191,
      "end_line": 205,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 25)",
        "(line 193,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 56)",
        "(line 202,col 9)-(line 202,col 19)",
        "(line 203,col 9)-(line 203,col 38)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 217,
      "end_line": 249,
      "comment": "\n     * Checks if the signature matches ASCII \"!\u003carch\u003e\" followed by a single LF\n     * control character\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an Ar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 20)"
      ]
    }
  ]
}