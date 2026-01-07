{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 36,
      "end_line": 406,
      "comment": "\n * Implements the \"ar\" archive format as an input stream.\n * \n * @NotThreadSafe\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntry"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * If getNextEnxtry has been called, the entry metadata is stored in\n     * currentEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "namebuffer"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Storage area for extra long names (GNU ar)"
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The offset where the current entry started. -1 if no entry has been\n     * called\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameBuf"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "lastModifiedBuf"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idBuf"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileModeBuf"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthBuf"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Constructs an Ar input stream with the referenced stream\n     * \n     * @param pInput\n     *            the ar input stream\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 82,
      "end_line": 166,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 115,col 46)",
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 117,col 45)",
        "(line 118,col 9)-(line 118,col 43)",
        "(line 120,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 29)",
        "(line 139,col 9)-(line 139,col 65)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 164,col 67)",
        "(line 165,col 9)-(line 165,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getExtendedName(int)",
      "begin_line": 175,
      "end_line": 188,
      "comment": "\n     * Get an extended name from the GNU extended name buffer.\n     * \n     * @param offset pointer to entry within the buffer\n     * @return the extended file name; without trailing \"/\" if present.\n     * @throws IOException if name not found or buffer not set up\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asLong(byte[])",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[])",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], boolean)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int, boolean)",
      "begin_line": 206,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 75)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveInputStream#getNextEntry()\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 230,
      "end_line": 237,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#close()\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 244,
      "end_line": 259,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 25)",
        "(line 247,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 56)",
        "(line 256,col 9)-(line 256,col 19)",
        "(line 257,col 9)-(line 257,col 36)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 271,
      "end_line": 303,
      "comment": "\n     * Checks if the signature matches ASCII \"!\u0026lt;arch\u0026gt;\" followed by a single LF\n     * control character\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an Ar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX_LEN"
      ],
      "begin_line": 306,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PATTERN"
      ],
      "begin_line": 308,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isBSDLongName(java.lang.String)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by BSD ar?\n     *\n     * \u003cp\u003eFrom the FreeBSD ar(5) man page:\u003c/p\u003e\n     * \u003cpre\u003e\n     * BSD   In the BSD variant, names that are shorter than 16\n     *       characters and without embedded spaces are stored\n     *       directly in this field.  If a name has an embedded\n     *       space, or if it is longer than 16 characters, then\n     *       the string \"#1/\" followed by the decimal represen-\n     *       tation of the length of the file name is placed in\n     *       this field. The actual file name is stored immedi-\n     *       ately after the archive header.  The content of the\n     *       archive member follows the file name.  The ar_size\n     *       field of the header (see below) will then hold the\n     *       sum of the size of the file name and the size of\n     *       the member.\n     * \u003c/pre\u003e\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getBSDLongName(java.lang.String)",
      "begin_line": 345,
      "end_line": 354,
      "comment": "\n     * Reads the real name from the current stream assuming the very\n     * first bytes to be read are the real file name.\n     *\n     * @see #isBSDLongName\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 347,col 77)",
        "(line 348,col 9)-(line 348,col 46)",
        "(line 349,col 9)-(line 349,col 55)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_STRING_TABLE_NAME"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNUStringTable(java.lang.String)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * Is this the name of the \"Archive String Table\" as used by\n     * SVR4/GNU to store long file names?\n     *\n     * \u003cp\u003eGNU ar stores multiple extended filenames in the data section\n     * of a file with the name \"//\", this record is referred to by\n     * future headers.\u003c/p\u003e\n     *\n     * \u003cp\u003eA header references an extended filename by storing a \"/\"\n     * followed by a decimal offset to the start of the filename in\n     * the extended filename data section.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format of the \"//\" file itself is simply a list of the\n     * long filenames, each separated by one or more LF\n     * characters. Note that the decimal offsets are number of\n     * characters, not line or string number within the \"//\" file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.readGNUStringTable(byte[])",
      "begin_line": 384,
      "end_line": 393,
      "comment": "\n     * Reads the GNU archive String Table.\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 42)",
        "(line 386,col 9)-(line 386,col 39)",
        "(line 387,col 9)-(line 387,col 73)",
        "(line 388,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGNAME_PATTERN"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNULongName(java.lang.String)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by SVR4/GNU ar?\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 66)"
      ]
    }
  ]
}