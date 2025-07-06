// Using Spring Data JPA
@Autowired
CountryRepository countryRepository;

@Transactional
public void saveCountry() {
    Country country = new Country();
    country.setCode("CN");
    country.setName("China");
    countryRepository.save(country);
}
