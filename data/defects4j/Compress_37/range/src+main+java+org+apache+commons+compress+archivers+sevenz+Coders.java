{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODER_MAP"
      ],
      "begin_line": 47,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 70,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 90)",
        "(line 73,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, java.lang.Object)",
      "begin_line": 81,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 90,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 91,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LZMADecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 102,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 103,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 55)",
        "(line 107,col 13)-(line 107,col 48)",
        "(line 108,col 13)-(line 110,col 13)",
        "(line 111,col 13)-(line 113,col 13)",
        "(line 114,col 13)-(line 114,col 90)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BCJDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 118,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "opts"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.BCJDecoder(org.tukaani.xz.FilterOptions)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 124,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 134,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 136,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 107)",
        "(line 139,col 13)-(line 143,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.Anonymous-c874003b-8dcb-43bf-9fb5-58f66adc6ee8.flush()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 147,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoder()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 152,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 57)",
        "(line 157,col 13)-(line 158,col 30)",
        "(line 159,col 13)-(line 183,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-5d72fb0c-4133-4abd-bc02-3f11669f7e4a.read()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 21)-(line 162,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-cefafa7b-f3a0-4119-b27a-1b77ad1ea294.read(byte[], int, int)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 21)-(line 167,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-b6ebada6-42b3-4bcc-bf99-c2b8b90a1141.read(byte[])",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 21)-(line 172,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-e07713cc-e984-4193-b514-3bc282f2572a.close()",
      "begin_line": 175,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 177,col 21)-(line 181,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 185,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 64)",
        "(line 188,col 13)-(line 188,col 64)",
        "(line 189,col 13)-(line 189,col 102)",
        "(line 190,col 13)-(line 214,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-f63df3b7-427c-490f-92b5-187624fffa2f.write(int)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 21)-(line 193,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-211f24fb-628d-4772-957c-d2a81ee25a06.write(byte[])",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 21)-(line 198,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-5e661ad0-7196-466f-bcfd-cd89cb6be7fd.write(byte[], int, int)",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 21)-(line 203,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.Anonymous-c92634bd-7488-4515-a19b-deba1e4d99a3.close()",
      "begin_line": 206,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 21)-(line 212,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 218,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.BZIP2Decoder()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 223,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 108)",
        "(line 233,col 13)-(line 233,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyByteAddingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 243,
      "end_line": 270,
      "comment": "\n     * ZLIB requires an extra dummy byte.\n     *\n     * @see java.util.zip.Inflater#Inflater(boolean)\n     * @see org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.DummyByteAddingInputStream(java.io.InputStream)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read()",
      "begin_line": 250,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 38)",
        "(line 253,col 13)-(line 256,col 13)",
        "(line 257,col 13)-(line 257,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read(byte[], int, int)",
      "begin_line": 260,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 55)",
        "(line 263,col 13)-(line 267,col 13)",
        "(line 268,col 13)-(line 268,col 26)"
      ]
    }
  ]
}