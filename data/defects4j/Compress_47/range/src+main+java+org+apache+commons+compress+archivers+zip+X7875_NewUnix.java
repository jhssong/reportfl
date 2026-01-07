{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X7875_NewUnix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 365,
      "comment": "\n * An extra field that stores UNIX UID/GID data (owner \u0026amp; group ownership) for a given\n * zip entry.  We\u0027re using the field definition given in Info-Zip\u0027s source archive:\n * zip-3.0.tar.gz/proginfo/extrafld.txt\n *\n * \u003cpre\u003e\n * Local-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x7875        Short       tag for this extra block type (\"ux\")\n * TSize         Short       total data size for this block\n * Version       1 byte      version of this extra field, currently 1\n * UIDSize       1 byte      Size of UID field\n * UID           Variable    UID for this entry (little endian)\n * GIDSize       1 byte      Size of GID field\n * GID           Variable    GID for this entry (little endian)\n *\n * Central-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x7855        Short       tag for this extra block type (\"Ux\")\n * TSize         Short       total data size for this block (0)\n * \u003c/pre\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THOUSAND"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " always \u00271\u0027 according to current info-zip spec."
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " NOTE:  equals() and hashCode() currently assume these can never be null."
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.X7875_NewUnix()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Constructor for X7875_NewUnix.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getHeaderId()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getUID()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Gets the UID as a long.  UID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the UID value.\n     ",
      "child_ranges": [
        "(line 97,col 28)-(line 97,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getGID()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Gets the GID as a long.  GID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the GID value.\n     ",
      "child_ranges": [
        "(line 107,col 28)-(line 107,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setUID(long)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Sets the UID.\n     *\n     * @param l UID value to set on this extra field.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setGID(long)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Sets the GID.\n     *\n     * @param l GID value to set on this extra field.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength()",
      "begin_line": 133,
      "end_line": 142,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 70)",
        "(line 136,col 9)-(line 136,col 53)",
        "(line 137,col 9)-(line 137,col 63)",
        "(line 138,col 9)-(line 138,col 53)",
        "(line 141,col 9)-(line 141,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Length of the extra field in the central directory data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData()",
      "begin_line": 161,
      "end_line": 201,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 44)",
        "(line 164,col 9)-(line 164,col 44)",
        "(line 169,col 9)-(line 169,col 61)",
        "(line 170,col 9)-(line 170,col 65)",
        "(line 171,col 9)-(line 171,col 61)",
        "(line 172,col 9)-(line 172,col 65)",
        "(line 179,col 9)-(line 179,col 68)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 20)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 191,col 9)-(line 191,col 59)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 27)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryData()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 222,
      "end_line": 238,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 16)",
        "(line 227,col 9)-(line 227,col 63)",
        "(line 228,col 9)-(line 228,col 68)",
        "(line 229,col 9)-(line 229,col 50)",
        "(line 230,col 9)-(line 230,col 61)",
        "(line 231,col 9)-(line 231,col 26)",
        "(line 232,col 9)-(line 232,col 56)",
        "(line 234,col 9)-(line 234,col 68)",
        "(line 235,col 9)-(line 235,col 50)",
        "(line 236,col 9)-(line 236,col 61)",
        "(line 237,col 9)-(line 237,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * Doesn\u0027t do anything since this class doesn\u0027t store anything\n     * inside the central directory.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.reset()",
      "begin_line": 254,
      "end_line": 258,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.clone()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals(java.lang.Object)",
      "begin_line": 277,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode()",
      "begin_line": 287,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 36)",
        "(line 293,col 9)-(line 293,col 53)",
        "(line 294,col 9)-(line 294,col 29)",
        "(line 295,col 9)-(line 295,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byte[])",
      "begin_line": 307,
      "end_line": 364,
      "comment": "\n     * Not really for external usage, but marked \"package\" visibility\n     * to help us JUnit it.   Trims a byte array of leading zeroes while\n     * also enforcing a minimum length, and thus it really trims AND pads\n     * at the same time.\n     *\n     * @param array byte[] array to trim \u0026 pad.\n     * @return trimmed \u0026 padded byte[] array.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 20)",
        "(line 313,col 9)-(line 319,col 9)",
        "(line 358,col 9)-(line 358,col 33)",
        "(line 360,col 9)-(line 360,col 87)",
        "(line 361,col 9)-(line 361,col 72)",
        "(line 362,col 9)-(line 362,col 93)",
        "(line 363,col 9)-(line 363,col 28)"
      ]
    }
  ]
}