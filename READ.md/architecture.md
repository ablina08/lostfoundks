# Architecture - Lost & Found KS (Advanced Version)

## Layers / Shtresat

1. Models – Item, User, Claim
2. Data – IRepository + FileRepository
3. Services – ItemService, UserService, ClaimService
4. UI – ConsoleUI (console menu)
5. Main.java – inicializon sistemin

## Responsibilities / Përgjegjësitë

- Models: ruajnë të dhëna, private fields + getters/setters
- Data: ruajtja dhe leximi nga CSV, abstrakton burimin e të dhënave
- Services: logjikë biznesi, validime
- UI: ndërfaqe me përdoruesin
- Main: bootstrap i sistemit, nuk ka logjikë biznesi

## Decisions / Arsye vendimesh

- Repository Pattern – për ndarje të logjikës së ruajtjes nga biznes logjika
- Automatic IDs – shmang gabimet manuale
- Search/Filter – fleksibilitet për përdoruesit
- Persistent CSV storage – ruan të dhënat midis sesioneve
- SOLID & Layered Architecture – për mirëmbajtje dhe zgjerim