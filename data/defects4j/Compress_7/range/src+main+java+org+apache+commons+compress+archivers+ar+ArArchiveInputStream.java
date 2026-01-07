{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 34,
      "end_line": 291,
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
        "namebuffer"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Storage area for extra long names (GNU ar)"
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The offset where the current entry started. -1 if no entry has been\n     * called\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Constructs an Ar input stream with the referenced stream\n     * \n     * @param pInput\n     *            the ar input stream\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 23)",
        "(line 63,col 9)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 73,
      "end_line": 168,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 116,col 9)-(line 116,col 44)",
        "(line 117,col 9)-(line 117,col 43)",
        "(line 119,col 9)-(line 119,col 19)",
        "(line 120,col 9)-(line 120,col 27)",
        "(line 121,col 9)-(line 121,col 21)",
        "(line 122,col 9)-(line 122,col 22)",
        "(line 123,col 9)-(line 123,col 23)",
        "(line 124,col 9)-(line 124,col 21)",
        "(line 126,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 29)",
        "(line 147,col 9)-(line 147,col 62)",
        "(line 149,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 64)",
        "(line 167,col 9)-(line 167,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getExtendedName(int)",
      "begin_line": 177,
      "end_line": 190,
      "comment": "\n     * Get an extended name from the GNU extended name buffer.\n     * \n     * @param offset pointer to entry within the buffer\n     * @return the extended file name; without trailing \"/\" if present.\n     * @throws IOException if name not found or buffer not set up\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asLong(byte[])",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[])",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveInputStream#getNextEntry()\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 218,
      "end_line": 224,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#close()\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 231,
      "end_line": 245,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 25)",
        "(line 233,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 56)",
        "(line 242,col 9)-(line 242,col 19)",
        "(line 243,col 9)-(line 243,col 38)",
        "(line 244,col 9)-(line 244,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 257,
      "end_line": 289,
      "comment": "\n     * Checks if the signature matches ASCII \"!\u003carch\u003e\" followed by a single LF\n     * control character\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an Ar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    }
  ]
}