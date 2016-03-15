# cljat-ws

A Clojure library designed to ... well, that part is up to you.

## Usage

### Run the deps volumes container
```
docker run -d --name lein_dev_deps -v ~/.lein:/root/.lein -v
~/.m2:/root/.m2 busybox
```

### Build docker image
```
docker build -t cljat-ws-nrepl-img -f Dockerfile.nrepl . 
```

### Run nrepl docker container for development
```
docker run --rm -t --volumes-from=lein_dev_deps -v $(pwd):/cljat-ws -p 8090:8090 -p 55655:7888 cljat-ws-nrepl-img
```

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
