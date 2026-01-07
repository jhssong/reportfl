{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 51,
      "end_line": 561,
      "comment": "\n * The DumpArchiveInputStream reads a UNIX dump archive as an InputStream.\n * Methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n *\n * There doesn\u0027t seem to exist a hint on the encoding of string values\n * in any piece documentation.  Given the main purpose of dump/restore\n * is backing up a system it seems very likely the format uses the\n * current default encoding of the system.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "active"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isClosed"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readIdx"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordOffset"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filepos"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "raw"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " map of ino -\u003e dirent entry. We can use this to reconstruct full paths."
    },
    {
      "type": "field",
      "varNames": [
        "pending"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " map of ino -\u003e (directory) entry when we\u0027re missing one or more elements in the path."
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " queue of (directory) entries where we now have the full path."
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Constructor using the platform\u0027s default encoding for file\n     * names.\n     *\n     * @param is stream to read from\n     * @throws ArchiveException on error\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 102,
      "end_line": 150,
      "comment": "\n     * Constructor.\n     *\n     * @param is stream to read from\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.6\n     * @throws ArchiveException on error\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 70)",
        "(line 109,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 27)",
        "(line 139,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.Anonymous-37aa7cd8-4135-4901-837a-b10e18240252.compare(org.apache.commons.compress.archivers.dump.DumpArchiveEntry, org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 143,col 25)-(line 145,col 25)",
        "(line 147,col 25)-(line 147,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getCount()",
      "begin_line": 152,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getSummary()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Return the archive summary information.\n     * @return the summary\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI()",
      "begin_line": 174,
      "end_line": 193,
      "comment": "\n     * Read CLRI (deleted inode) segment.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 47)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 48)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS()",
      "begin_line": 198,
      "end_line": 217,
      "comment": "\n     * Read BITS segment.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 47)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 48)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Read the next entry.\n     * @return the next entry\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry()",
      "begin_line": 228,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 38)",
        "(line 231,col 9)-(line 231,col 27)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 314,col 28)",
        "(line 315,col 9)-(line 315,col 65)",
        "(line 316,col 9)-(line 316,col 33)",
        "(line 318,col 9)-(line 318,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 324,
      "end_line": 407,
      "comment": "\n     * Read directory entry.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 41)",
        "(line 327,col 9)-(line 327,col 29)",
        "(line 329,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 415,
      "end_line": 451,
      "comment": "\n     * Get full path for specified archive entry, or null if there\u0027s a gap.\n     *\n     * @param entry\n     * @return  full path for specified archive entry, or null if there\u0027s a gap.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 53)",
        "(line 419,col 9)-(line 419,col 29)",
        "(line 421,col 9)-(line 433,col 9)",
        "(line 436,col 9)-(line 440,col 9)",
        "(line 443,col 9)-(line 443,col 67)",
        "(line 445,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(byte[], int, int)",
      "begin_line": 466,
      "end_line": 524,
      "comment": "\n     * Reads bytes from the current dump archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param off The offset at which to place bytes read.\n     * @param len The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 26)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 33)",
        "(line 523,col 9)-(line 523,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close()",
      "begin_line": 529,
      "end_line": 535,
      "comment": "\n     * Closes the stream for this entry.\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byte[], int)",
      "begin_line": 545,
      "end_line": 559,
      "comment": "\n     * Look at the first few bytes of the file to decide if it\u0027s a dump\n     * archive. With 32 bytes we can look at the magic value, with a full\n     * 1k we can verify the checksum.\n     * @param buffer data to match\n     * @param length length of data\n     * @return whether the buffer seems to contain dump data\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 557,col 9)-(line 558,col 16)"
      ]
    }
  ]
}