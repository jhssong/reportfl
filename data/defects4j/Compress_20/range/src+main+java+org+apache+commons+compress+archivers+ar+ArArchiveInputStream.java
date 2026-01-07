{
  "filepath": "/tmp/Compress-20b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 35,
      "end_line": 418,
      "comment": "\n * Implements the \"ar\" archive format as an input stream.\n * \n * @NotThreadSafe\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntry"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * If getNextEnxtry has been called, the entry metadata is stored in\n     * currentEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "namebuffer"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Storage area for extra long names (GNU ar)"
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The offset where the current entry started. -1 if no entry has been\n     * called\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NAME_BUF"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MODIFIED_BUF"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ID_BUF"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FILE_MODE_BUF"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LENGTH_BUF"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Constructs an Ar input stream with the referenced stream\n     * \n     * @param pInput\n     *            the ar input stream\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 81,
      "end_line": 172,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 23)",
        "(line 119,col 9)-(line 119,col 32)",
        "(line 120,col 9)-(line 120,col 21)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 21)",
        "(line 123,col 9)-(line 123,col 28)",
        "(line 124,col 9)-(line 124,col 25)",
        "(line 126,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 29)",
        "(line 145,col 9)-(line 145,col 66)",
        "(line 146,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 152,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 170,col 69)",
        "(line 171,col 9)-(line 171,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getExtendedName(int)",
      "begin_line": 181,
      "end_line": 194,
      "comment": "\n     * Get an extended name from the GNU extended name buffer.\n     * \n     * @param offset pointer to entry within the buffer\n     * @return the extended file name; without trailing \"/\" if present.\n     * @throws IOException if name not found or buffer not set up\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asLong(byte[])",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[])",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], boolean)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int, boolean)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 65)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveInputStream#getNextEntry()\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#close()\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 249,
      "end_line": 264,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 56)",
        "(line 261,col 9)-(line 261,col 19)",
        "(line 262,col 9)-(line 262,col 38)",
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 276,
      "end_line": 308,
      "comment": "\n     * Checks if the signature matches ASCII \"!\u003carch\u003e\" followed by a single LF\n     * control character\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an Ar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX_LEN"
      ],
      "begin_line": 311,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PATTERN"
      ],
      "begin_line": 313,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isBSDLongName(java.lang.String)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by BSD ar?\n     *\n     * \u003cp\u003eFrom the FreeBSD ar(5) man page:\u003c/p\u003e\n     * \u003cpre\u003e\n     * BSD   In the BSD variant, names that are shorter than 16\n     *       characters and without embedded spaces are stored\n     *       directly in this field.  If a name has an embedded\n     *       space, or if it is longer than 16 characters, then\n     *       the string \"#1/\" followed by the decimal represen-\n     *       tation of the length of the file name is placed in\n     *       this field. The actual file name is stored immedi-\n     *       ately after the archive header.  The content of the\n     *       archive member follows the file name.  The ar_size\n     *       field of the header (see below) will then hold the\n     *       sum of the size of the file name and the size of\n     *       the member.\n     * \u003c/pre\u003e\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getBSDLongName(java.lang.String)",
      "begin_line": 350,
      "end_line": 366,
      "comment": "\n     * Reads the real name from the current stream assuming the very\n     * first bytes to be read are the real file name.\n     *\n     * @see #isBSDLongName\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 352,col 77)",
        "(line 353,col 9)-(line 353,col 40)",
        "(line 354,col 9)-(line 354,col 34)",
        "(line 355,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_STRING_TABLE_NAME"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNUStringTable(java.lang.String)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Is this the name of the \"Archive String Table\" as used by\n     * SVR4/GNU to store long file names?\n     *\n     * \u003cp\u003eGNU ar stores multiple extended filenames in the data section\n     * of a file with the name \"//\", this record is referred to by\n     * future headers.\u003c/p\u003e\n     *\n     * \u003cp\u003eA header references an extended filename by storing a \"/\"\n     * followed by a decimal offset to the start of the filename in\n     * the extended filename data section.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format of the \"//\" file itself is simply a list of the\n     * long filenames, each separated by one or more LF\n     * characters. Note that the decimal offsets are number of\n     * characters, not line or string number within the \"//\" file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.readGNUStringTable(byte[])",
      "begin_line": 396,
      "end_line": 405,
      "comment": "\n     * Reads the GNU archive String Table.\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 36)",
        "(line 398,col 9)-(line 398,col 39)",
        "(line 399,col 9)-(line 399,col 48)",
        "(line 400,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGNAME_PATTERN"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNULongName(java.lang.String)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by SVR4/GNU ar?\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 66)"
      ]
    }
  ]
}